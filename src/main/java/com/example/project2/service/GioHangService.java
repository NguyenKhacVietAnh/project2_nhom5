package com.example.project2.service;


import com.example.project2.entity.GioHangEntity;

import java.util.List;

public interface GioHangService {
    List<GioHangEntity> getAll();
    void save(GioHangEntity gioHang);
    void delete(Long id);
    List<GioHangEntity> findByName(String name);
    GioHangEntity findById(Long id);
}
