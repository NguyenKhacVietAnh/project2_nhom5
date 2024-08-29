package com.example.project2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "sanpham")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class SanPhamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSanPham;

    @Column(name = "tenSanPham")
    private String tenSanPham;

    @Column(name = "idChiTietSanPham")
    private String idChiTietSanPham;
}
