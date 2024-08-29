package com.example.project2.service;



import com.example.project2.entity.SanPhamEntity;

import java.util.List;

public interface SanPhamService {
    List<SanPhamEntity> getAll();
    void save(SanPhamEntity sanPham);
    void delete(Long id);
    List<SanPhamEntity> findByName(String name);
    SanPhamEntity findById(Long id);
}
