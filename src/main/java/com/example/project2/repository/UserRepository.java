package com.example.project2.repository;

import com.example.project2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByNameContaining(String name);
//    boolean existsByNameAndPhone(String name, String phone);
}
