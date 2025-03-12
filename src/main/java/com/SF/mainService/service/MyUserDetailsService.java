package com.SF.mainService.service;

import com.SF.mainService.dto.UserDetailsDto;
import com.SF.mainService.model.UserPrincipal;
import com.SF.mainService.repository.UserDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserDetailsRepo userDetailsRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetailsDto user = userDetailsRepo.getUserSecurityDetails(username);
        System.out.println(user);
        if(user == null){
            System.out.println("User not found");
            throw new UsernameNotFoundException("User not found");
        }

        return new UserPrincipal(user);
    }
}
