package com.ankit.projects.airBnbApp.dto;

import com.ankit.projects.airBnbApp.entity.User;
import com.ankit.projects.airBnbApp.entity.enums.Gender;
import lombok.Data;

@Data
public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}
