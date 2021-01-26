package com.group41.greenr.service;

import com.group41.greenr.model.User;
import com.group41.greenr.web.dto.UserRegistrationDto;

public interface UserService {
	User save(UserRegistrationDto registrionDto);

}
