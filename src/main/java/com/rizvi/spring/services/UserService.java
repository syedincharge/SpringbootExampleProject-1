package com.rizvi.spring.services;

import com.rizvi.spring.dto.UserRegistrationDto;
import com.rizvi.spring.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;



public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}