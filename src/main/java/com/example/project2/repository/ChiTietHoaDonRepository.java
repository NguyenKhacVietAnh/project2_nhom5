package com.example.project2.repository;

import com.example.project2.entity.ChiTietHoaDonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiTietHoaDonRepository extends JpaRepository<ChiTietHoaDonEntity,Long> {
}
