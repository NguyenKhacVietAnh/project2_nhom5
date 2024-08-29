package com.example.project2.service;



import com.example.project2.entity.MauSacEntity;

import java.util.List;

public interface MauSacService {
    List<MauSacEntity> getAll();
    void save(MauSacEntity mauSac);
    void delete(Long id);
    //    List<User> findByName(String name);
    MauSacEntity findById(Long id);
}
