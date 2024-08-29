package com.example.project2.service.impl;


import com.example.project2.entity.ChiTietHoaDonEntity;
import com.example.project2.repository.ChiTietHoaDonRepository;
import com.example.project2.service.ChiTietHoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ChiTietHoaDonImpl implements ChiTietHoaDonService {
    @Autowired
    private ChiTietHoaDonRepository chiTietHoaDonRepository;

    @Override
    public List<ChiTietHoaDonEntity> getAll() {
        return chiTietHoaDonRepository.findAll();
    }

    @Override
    public void save(ChiTietHoaDonEntity chiTietHoaDon) {
        chiTietHoaDonRepository.save(chiTietHoaDon);
    }

    @Override
    public void delete(Long id) {
        chiTietHoaDonRepository.deleteById(id);
    }

//    @Override
//    public List<User> findByName(String name) {
//        return userRepository.findByNameContaining(name);
//    }

    @Override
    public ChiTietHoaDonEntity findById(Long id) {
        return chiTietHoaDonRepository.findById(id).get();
    }
}
