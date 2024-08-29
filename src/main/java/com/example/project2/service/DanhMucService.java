package com.example.project2.service;



import com.example.project2.entity.DanhMucEntity;

import java.util.List;

public interface DanhMucService {
    List<DanhMucEntity> getAll();
    void save(DanhMucEntity danhMuc);
    void delete(Long id);
    //    List<User> findByName(String name);
    DanhMucEntity findById(Long id);
}
