package com.tobeto.geriBildirimsistemi.repositories;

import com.tobeto.geriBildirimsistemi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
