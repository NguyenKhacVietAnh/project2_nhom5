package com.example.project2.service;



import com.example.project2.entity.DanhGiaEntity;

import java.util.List;

public interface DanhGiaService {
    List<DanhGiaEntity> getAll();
    void save(DanhGiaEntity danhGia);
    void delete(Long id);
    List<DanhGiaEntity> findByName(String name);
    DanhGiaEntity findById(Long id);
}
