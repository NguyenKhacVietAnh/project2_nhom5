package com.example.project2.service.impl;

import com.example.project2.entity.ManagerUserEntity;
import com.example.project2.repository.ManagerUserReposytory;
import com.example.project2.service.ManagerUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ManagerUserServiceImpl implements ManagerUserService{
    @Autowired
    private ManagerUserReposytory managerUserReposytory;

    @Override
    public List<ManagerUserEntity> getAll() {
        return managerUserReposytory.findAll();
    }

    @Override
    public void save(ManagerUserEntity user) {
        managerUserReposytory.save(user);
    }

    @Override
    public void delete(Long id) {
        managerUserReposytory.deleteById(id);
    }

}
