package com.example.project2.service.impl;
import com.example.project2.entity.PhuongThucThanhToanEntity;
import com.example.project2.repository.PhuongThucThanhToanRepository;
import com.example.project2.service.PhuongThucThanhToanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class PhuongThucThanhToanImpl implements PhuongThucThanhToanService {
    @Autowired
    private PhuongThucThanhToanRepository phuongThucThanhToanRepository;

    @Override
    public List<PhuongThucThanhToanEntity> getAll() {
        return phuongThucThanhToanRepository.findAll();
    }

    @Override
    public void save(PhuongThucThanhToanEntity phuongThucThanhToan) {
        phuongThucThanhToanRepository.save(phuongThucThanhToan);
    }

    @Override
    public void delete(Long id) {
        phuongThucThanhToanRepository.deleteById(id);
    }

//    @Override
//    public List<User> findByName(String name) {
//        return userRepository.findByNameContaining(name);
//    }

    @Override
    public PhuongThucThanhToanEntity findById(Long id) {
        return phuongThucThanhToanRepository.findById(id).get();
    }
}
