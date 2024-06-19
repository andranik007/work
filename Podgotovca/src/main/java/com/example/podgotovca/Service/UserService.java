package com.example.podgotovca.Service;

import com.example.podgotovca.Dto.UserDto;
import com.example.podgotovca.Entity.Role;
import com.example.podgotovca.Entity.User;
import com.example.podgotovca.Repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@RequiredArgsConstructor

public class UserService {

    private final UserRepo userRepo;
    private final PasswordEncoder passwordEncoder;

    public void registration(UserDto userDto){
        User user = new User();
        user.setName(userDto.getName());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        user.setRoles(Collections.singleton(Role.USER));
        userRepo.save(user);
    }

    public User findByName(String name){
        return userRepo.findByName(name);
    }
}
