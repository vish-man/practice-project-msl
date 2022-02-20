package com.vishwanath.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.vishwanath.springboot.model.User;
import com.vishwanath.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
