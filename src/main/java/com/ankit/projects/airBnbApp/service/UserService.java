package com.ankit.projects.airBnbApp.service;

import com.ankit.projects.airBnbApp.dto.ProfileUpdateRequestDto;
import com.ankit.projects.airBnbApp.dto.UserDto;
import com.ankit.projects.airBnbApp.entity.User;

public interface UserService {

    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();
}
