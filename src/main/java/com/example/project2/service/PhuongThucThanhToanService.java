package com.example.project2.service;
import com.example.project2.entity.PhuongThucThanhToanEntity;
import java.util.List;

public interface PhuongThucThanhToanService {
    List<PhuongThucThanhToanEntity> getAll();
    void save(PhuongThucThanhToanEntity PhuongThucThanhToan);
    void delete(Long id);
    //        List<User> findByName(String name);
    PhuongThucThanhToanEntity findById(Long id);
}
