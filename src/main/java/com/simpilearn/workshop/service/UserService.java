package com.simpilearn.workshop.service;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.simpilearn.workshop.model.OrderDetails;
import com.simpilearn.workshop.model.User;
import com.simpilearn.workshop.web.dto.UserOrderDetailsDto;
import com.simpilearn.workshop.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
	//OrderDetails save(UserOrderDetailsDto userOrderDetailsDto);
}