package com.example.project2.service.impl;


import com.example.project2.entity.DanhGiaEntity;
import com.example.project2.repository.DanhGiaRepository;
import com.example.project2.service.DanhGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class DanhGiaServiceImpl implements DanhGiaService {
    @Autowired
    private DanhGiaRepository danhGiaRepository;

    @Override
    public List<DanhGiaEntity> getAll() {
        return danhGiaRepository.findAll();
    }

    @Override
    public void save(DanhGiaEntity danhgia) {
        danhGiaRepository.save(danhgia);
    }

    @Override
    public void delete(Long id) {
        danhGiaRepository.deleteById(id);
    }

    @Override
    public List<DanhGiaEntity> findByName(String name) {
        return danhGiaRepository.findByNameContaining(name);
    }

    @Override
    public DanhGiaEntity findById(Long id) {
        return danhGiaRepository.findById(id).get();
    }
}
