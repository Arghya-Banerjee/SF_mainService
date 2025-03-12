
package com.SF.mainService.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    @GetMapping("/hello")
    @PreAuthorize("hasAuthority('USER')")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/adminhello")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String adminHello(){
        return "Hello, Admin";
    }

}
