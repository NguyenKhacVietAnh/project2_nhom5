package com.example.project2.repository;


import com.example.project2.entity.DanhGiaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DanhGiaRepository extends JpaRepository<DanhGiaEntity, Long> {
    List<DanhGiaEntity> findByNameContaining(String name);
}
