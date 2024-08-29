package com.example.project2.repository;


import com.example.project2.entity.ChiTietSanPhamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiTietSanPhamRepository extends JpaRepository<ChiTietSanPhamEntity, Long> {
}
