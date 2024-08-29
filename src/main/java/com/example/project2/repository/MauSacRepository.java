package com.example.project2.repository;


import com.example.project2.entity.MauSacEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MauSacRepository extends JpaRepository<MauSacEntity,Long> {
}
