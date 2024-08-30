package com.example.project2.service;

import com.example.project2.entity.RoleEntity;

import java.util.List;

public interface RoleService {
    List<RoleEntity> getAll();
    void save(RoleEntity user);
    void delete(Long id);
//    List<UserEntity> findByName(String name);

}
