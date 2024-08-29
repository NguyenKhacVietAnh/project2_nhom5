package com.example.project2.service.impl;


import com.example.project2.entity.SanPhamEntity;
import com.example.project2.repository.SanPhamRepository;
import com.example.project2.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanPhamServiceImpl implements SanPhamService {
    @Autowired
    private SanPhamRepository sanPhamRepository;

    @Override
    public List<SanPhamEntity> getAll() {
        return sanPhamRepository.findAll();
    }

    @Override
    public void save(SanPhamEntity Sanpham) {
        sanPhamRepository.save(Sanpham);
    }

    @Override
    public void delete(Long id) {
        sanPhamRepository.deleteById(id);
    }

    @Override
    public List<SanPhamEntity> findByName(String name) {
        return sanPhamRepository.findByNameContaining(name);
    }

    @Override
    public SanPhamEntity findById(Long id) {
        return sanPhamRepository.findById(id).get();
    }
}

