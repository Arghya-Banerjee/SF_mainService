package com.SF.mainService.service;

import com.SF.mainService.dto.UserDetailsDto;
import com.SF.mainService.dto.UserPrincipal;
import com.SF.mainService.dto.UserRolesDto;
import com.SF.mainService.repository.UserDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserDetailsRepo userDetailsRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserDetailsDto user = userDetailsRepo.getUserSecurityDetails(username);
        List<UserRolesDto> rolesTemp = userDetailsRepo.getUserRoles(username);

        List<String> roles = new ArrayList<String>();
        for(UserRolesDto role: rolesTemp) roles.add(role.getUserRole());

        if(user == null){
            System.out.println("User not found");
            throw new UsernameNotFoundException("User not found");
        }

        return new UserPrincipal(user, roles);
    }
}
