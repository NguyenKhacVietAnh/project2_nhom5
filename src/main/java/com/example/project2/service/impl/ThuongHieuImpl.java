package com.example.project2.service.impl;


import com.example.project2.entity.ThuongHieuEntity;
import com.example.project2.repository.ThuongHieuRepository;
import com.example.project2.service.ThuongHieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ThuongHieuImpl implements ThuongHieuService {
    @Autowired
    private ThuongHieuRepository thuongHieuRepository;
    @Override
    public List<ThuongHieuEntity> getAll() {return thuongHieuRepository.findAll();}

    @Override
    public void save(ThuongHieuEntity user) {
        thuongHieuRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        thuongHieuRepository.deleteById(id);
    }

//    @Override
//    public List<User> findByName(String name) {
//        return userRepository.findByNameContaining(name);
//    }

    @Override
    public ThuongHieuEntity findById(Long id) {return thuongHieuRepository.findById(id).get();}

}
