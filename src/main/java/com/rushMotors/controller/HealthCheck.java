package com.rushMotors.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/api")
public class HealthCheck {
    @GetMapping("/health")
    public String healthCheck(){
        return "GET "+ ServletUriComponentsBuilder.fromCurrentRequestUri().toUriString() +" is working fine";
    }

    @PostMapping("/health")
    public String healthCheck(@RequestParam(name="username",required = false,defaultValue = "Tonmoy Dey")String username){
        return "POST "+ServletUriComponentsBuilder.fromCurrentRequestUri().toUriString() +" is working fine.\nHello "+username;
    }
}
