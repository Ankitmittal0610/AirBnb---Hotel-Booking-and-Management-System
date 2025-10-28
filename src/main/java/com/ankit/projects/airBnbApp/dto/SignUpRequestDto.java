package com.ankit.projects.airBnbApp.dto;

import com.ankit.projects.airBnbApp.entity.enums.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class SignUpRequestDto {
    private String email;
    private String password;
    private String name;
    private Gender gender;
    private LocalDate dateOfBirth;
}
