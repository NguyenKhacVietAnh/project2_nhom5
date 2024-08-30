package com.example.project2.service.impl;

import com.example.project2.entity.RoleEntity;
import com.example.project2.repository.RoleRepository;
import com.example.project2.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<RoleEntity> getAll() {
        return roleRepository.findAll();
    }

    @Override
    public void save(RoleEntity user) {
        roleRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        roleRepository.deleteById(id);
    }
}
