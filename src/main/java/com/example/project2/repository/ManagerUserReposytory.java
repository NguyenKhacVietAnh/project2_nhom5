package com.example.project2.repository;

import com.example.project2.entity.ManagerUserEntity;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerUserReposytory extends JpaRepository<ManagerUserEntity,Long> {

}

