package com.example.project2.repository;


import com.example.project2.entity.GioHangEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GioHangRepository extends JpaRepository<GioHangEntity, Long> {
    List<GioHangEntity> findByNameContaining(String name);
}
