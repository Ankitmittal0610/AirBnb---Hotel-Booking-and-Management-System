package com.ankit.projects.airBnbApp.entity;

import com.ankit.projects.airBnbApp.entity.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "app_user") // postgres db internally used user table.
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true,nullable = false)
    private String email;

    @Column(nullable = false)
    private String password; //plain text

    private String name;

    @ElementCollection(fetch = FetchType.EAGER) // this will create another table named app_user_roles
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;


}
