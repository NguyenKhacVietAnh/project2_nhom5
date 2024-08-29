package com.example.project2.service.impl;
import com.example.project2.entity.HoaDonEntity;
import com.example.project2.repository.HoaDonRepository;
import com.example.project2.service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class HoaDonImpl implements HoaDonService {
    @Autowired
    private HoaDonRepository hoaDonRepository;

    @Override
    public List<HoaDonEntity> getAll() {
        return hoaDonRepository.findAll();
    }

    @Override
    public void save(HoaDonEntity hoaDon) {
        hoaDonRepository.save(hoaDon);
    }

    @Override
    public void delete(Long id) {
        hoaDonRepository.deleteById(id);
    }

//    @Override
//    public List<User> findByName(String name) {
//        return userRepository.findByNameContaining(name);
//    }

    @Override
    public HoaDonEntity findById(Long id) {
        return hoaDonRepository.findById(id).get();
    }
}
