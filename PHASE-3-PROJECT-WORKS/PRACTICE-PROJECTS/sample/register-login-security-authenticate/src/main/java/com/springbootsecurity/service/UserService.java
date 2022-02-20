package com.springbootsecurity.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.springbootsecurity.model.User;
import com.springbootsecurity.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
	
	User save(UserRegistrationDto registrationDto);

}
