package com.example.project2.repository;


import com.example.project2.entity.SanPhamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPhamEntity, Long> {
    List<SanPhamEntity> findByNameContaining(String name);
}
