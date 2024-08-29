package com.example.project2.service.impl;


import com.example.project2.entity.MauSacEntity;
import com.example.project2.repository.MauSacRepository;
import com.example.project2.service.MauSacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MauSacImpl implements MauSacService {
    @Autowired
    private MauSacRepository mauSacRepository;

    @Override
    public List<MauSacEntity> getAll() {return mauSacRepository.findAll();
    }

    @Override
    public void save(MauSacEntity user) {
        mauSacRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        mauSacRepository.deleteById(id);
    }

//    @Override
//    public List<User> findByName(String name) {
//        return userRepository.findByNameContaining(name);
//    }

    @Override
    public MauSacEntity findById(Long id) {
        return mauSacRepository.findById(id).get();
    }
}

