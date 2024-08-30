package com.example.project2.service.impl;

import com.example.project2.entity.UserEntity;
import com.example.project2.repository.UserRepository;
import com.example.project2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserEntity> getAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(UserEntity user) {
        userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

//    @Override
//    public List<UserEntity> findByName(String name) {
//        return userRepository.findByNameContaining(name);
//    }
}
