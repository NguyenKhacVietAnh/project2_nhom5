package com.example.project2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "giohang")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class GioHangEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idGioHang;

    @Column(name = "idSanPham")
    private String name;

    @Column(name = "SoLuong")
    private String email;

    @Column(name = "DonGia")
    private String phone;
}
