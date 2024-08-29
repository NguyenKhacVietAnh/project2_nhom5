package com.example.project2.repository;

import com.example.project2.entity.PhuongThucThanhToanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhuongThucThanhToanRepository extends JpaRepository<PhuongThucThanhToanEntity, Long> {

}
