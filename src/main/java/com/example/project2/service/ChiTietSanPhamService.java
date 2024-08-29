package com.example.project2.service;



import com.example.project2.entity.ChiTietSanPhamEntity;

import java.util.List;

public interface ChiTietSanPhamService {
    List<ChiTietSanPhamEntity> getAll();
    void save(ChiTietSanPhamEntity chiTietSanPham);
    void delete(Long id);
    //    List<User> findByName(String name);
    ChiTietSanPhamEntity findById(Long id);
}

