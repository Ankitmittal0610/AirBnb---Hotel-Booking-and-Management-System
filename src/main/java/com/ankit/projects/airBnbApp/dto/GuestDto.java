package com.ankit.projects.airBnbApp.dto;

import com.ankit.projects.airBnbApp.entity.User;
import com.ankit.projects.airBnbApp.entity.enums.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class GuestDto {
    private Long id;
    private String name;
    private Gender gender;
    private LocalDate dateOfBirth;
}
