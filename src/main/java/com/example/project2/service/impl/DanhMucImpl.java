package com.example.project2.service.impl;


import com.example.project2.entity.DanhMucEntity;
import com.example.project2.repository.DanhMucRepository;
import com.example.project2.service.DanhMucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class DanhMucImpl implements DanhMucService {
    @Autowired
    private DanhMucRepository danhMucRepository;

    @Override
    public List<DanhMucEntity> getAll() {
        return danhMucRepository.findAll();
    }

    @Override
    public void save(DanhMucEntity danhMuc) {
        danhMucRepository.save(danhMuc);
    }

    @Override
    public void delete(Long id) {
        danhMucRepository.deleteById(id);
    }

//    @Override
//    public List<User> findByName(String name) {
//        return userRepository.findByNameContaining(name);
//    }

    @Override
    public DanhMucEntity findById(Long id) {
        return danhMucRepository.findById(id).get();
    }
}
