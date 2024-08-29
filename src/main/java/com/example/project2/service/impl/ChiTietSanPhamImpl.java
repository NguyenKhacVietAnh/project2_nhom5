package com.example.project2.service.impl;

import com.example.project2.entity.ChiTietSanPhamEntity;
import com.example.project2.repository.ChiTietSanPhamRepository;
import com.example.project2.service.ChiTietSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ChiTietSanPhamImpl implements ChiTietSanPhamService {
    @Autowired
    private ChiTietSanPhamRepository chiTietSanPhamRepository;

    @Override
    public List<ChiTietSanPhamEntity> getAll() {
        return chiTietSanPhamRepository.findAll();
    }

    @Override
    public void save(ChiTietSanPhamEntity user) {
        chiTietSanPhamRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        chiTietSanPhamRepository.deleteById(id);
    }

//    @Override
//    public List<User> findByName(String name) {
//        return userRepository.findByNameContaining(name);
//    }

    @Override
    public ChiTietSanPhamEntity findById(Long id) {return chiTietSanPhamRepository.findById(id).get();}
}

