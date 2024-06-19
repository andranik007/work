package com.example.podgotovca.Repo;


import com.example.podgotovca.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

    User findByName(String name);
}
