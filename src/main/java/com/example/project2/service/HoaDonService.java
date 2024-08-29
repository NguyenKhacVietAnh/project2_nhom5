package com.example.project2.service;
import com.example.project2.entity.HoaDonEntity;
import java.util.List;

public interface HoaDonService {
    List<HoaDonEntity> getAll();
    void save(HoaDonEntity HoaDon);
    void delete(Long id);
    //        List<User> findByName(String name);
    HoaDonEntity findById(Long id);
}
