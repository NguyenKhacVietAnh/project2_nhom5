package com.example.project2.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "hoadon")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class HoaDonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idHoaDon;

    @Column(name = "iduser")
    private Long idUser;

    @Column(name = "idgiohang")
    private Long idGioHang;


    @Column(name = "ten")
    private String tenKhachHang;

    @Column(name = "diachinhanhang")
    private String diaChiNhanHang;

    @Column(name = "dongia")
    private String donGia;

    @Column(name = "thanhtien")
    private String thanhTien;
}
