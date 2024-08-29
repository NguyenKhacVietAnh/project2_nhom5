package com.example.project2.repository;


import com.example.project2.entity.ThuongHieuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThuongHieuRepository extends JpaRepository<ThuongHieuEntity,Long> {
}
