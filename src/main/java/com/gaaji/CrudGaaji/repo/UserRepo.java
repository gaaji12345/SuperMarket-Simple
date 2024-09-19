package com.gaaji.CrudGaaji.repo;/*  gaajiCode
    99
    15/09/2024
    */

import com.gaaji.CrudGaaji.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
    User findByUsername(String username);
}

