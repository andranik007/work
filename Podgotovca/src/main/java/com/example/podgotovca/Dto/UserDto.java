package com.example.podgotovca.Dto;

import com.example.podgotovca.Entity.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {
    private Long id;
    private String name;
    private String password;
    private Set<Role> roles;
}
