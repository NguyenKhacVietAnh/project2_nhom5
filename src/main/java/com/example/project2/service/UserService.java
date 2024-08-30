package com.example.project2.service;

import com.example.project2.entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> getAll();
    void save(UserEntity user);
    void delete(Long id);
//    List<UserEntity> findByName(String name);
}
