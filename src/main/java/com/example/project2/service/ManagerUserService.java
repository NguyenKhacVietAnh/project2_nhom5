package com.example.project2.service;

import com.example.project2.entity.ManagerUserEntity;

import java.util.List;

public interface ManagerUserService {
    List<ManagerUserEntity> getAll();
    void save(ManagerUserEntity user);
    void delete(Long id);
//    List<UserEntity> findByName(String name);

}
