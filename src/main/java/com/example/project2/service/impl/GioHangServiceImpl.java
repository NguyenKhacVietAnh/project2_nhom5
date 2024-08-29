package com.example.project2.service.impl;


import com.example.project2.entity.GioHangEntity;
import com.example.project2.repository.GioHangRepository;
import com.example.project2.service.GioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class GioHangServiceImpl implements GioHangService {

    @Autowired
    private GioHangRepository gioHangRepository;

    @Override
    public List<GioHangEntity> getAll() {
        return gioHangRepository.findAll();
    }

    @Override
    public void save(GioHangEntity Giohangs) {
        gioHangRepository.save(Giohangs);
    }

    @Override
    public void delete(Long id) {
        gioHangRepository.deleteById(id);
    }

    @Override
    public List<GioHangEntity> findByName(String name) {
        return gioHangRepository.findByNameContaining(name);
    }

    @Override
    public GioHangEntity findById(Long id) {
        return gioHangRepository.findById(id).get();
    }
}
