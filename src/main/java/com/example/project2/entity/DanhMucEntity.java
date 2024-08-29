package com.example.project2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "DanhMuc")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class DanhMucEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "iddanhmuc")
    private Long idDanhMuc;

    @Column(name = "tendanhmuc")
    private String tenDanhMuc;

    @Column(name = "mota")
    private String moTa;
}
