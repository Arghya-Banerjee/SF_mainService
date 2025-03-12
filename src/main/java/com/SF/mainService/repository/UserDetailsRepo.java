package com.SF.mainService.repository;

import com.SF.mainService.dto.UserDetailsDto;
import com.SF.mainService.model.RootEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

public interface UserDetailsRepo extends JpaRepository<RootEntity, Long> {

    @Query(value = "EXEC usp_Security @opMode = 1, @username = :username", nativeQuery = true)
    UserDetailsDto getUserSecurityDetails(
            @Param("username") String username
    );

}
