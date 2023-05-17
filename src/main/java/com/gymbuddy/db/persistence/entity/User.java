package com.gymbuddy.db.persistence.entity;

import com.gymbuddy.db.persistence.entity.enums.AuthRoles;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity(name = "users")
@Getter
@Setter
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long userId;
    private String fullName;
    @Column(unique = true)
    @NotNull
    private String username;
    @Email
    @NotNull
    private String email;
    @Column(length = 60)
    @NotNull
    private String password;
    @Enumerated(EnumType.STRING)
    @NotNull
    private AuthRoles role;
    @PastOrPresent
    @NotNull
    private LocalDate registrationDate;
    private Boolean enabled = false;
}
