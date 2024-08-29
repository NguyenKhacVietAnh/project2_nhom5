package com.example.project2.service;

import com.example.project2.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    void save(User user);
    void delete(Long id);
    List<User> findByName(String name);
    User findById(Long id);
}
