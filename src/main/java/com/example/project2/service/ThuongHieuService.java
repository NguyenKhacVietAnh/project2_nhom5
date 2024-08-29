package com.example.project2.service;



import com.example.project2.entity.ThuongHieuEntity;

import java.util.List;

public interface ThuongHieuService {
    List<ThuongHieuEntity> getAll();
    void save(ThuongHieuEntity thuongHieu);
    void delete(Long id);
    //    List<User> findByName(String name);
    ThuongHieuEntity findById(Long id);
}
