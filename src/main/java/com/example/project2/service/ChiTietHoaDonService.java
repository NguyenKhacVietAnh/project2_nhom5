package com.example.project2.service;
import com.example.project2.entity.ChiTietHoaDonEntity;
import java.util.List;

public interface ChiTietHoaDonService {
    List<ChiTietHoaDonEntity> getAll();
    void save(ChiTietHoaDonEntity ChiTietHoaDon);
    void delete(Long id);
//        List<User> findByName(String name);
    ChiTietHoaDonEntity findById(Long id);
}
