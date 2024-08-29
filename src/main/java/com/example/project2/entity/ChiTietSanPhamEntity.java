package com.example.project2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ChiTietSanPham")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ChiTietSanPhamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idsanpham")
    private Long idSanPham;

    @Column(name = "iddanhmuc")
    private Long idDanhMuc;

    @Column(name = "idthuonghieu")
    private Long idThuongHieu;

    @Column(name = "idmausac")
    private Long idMauSac;

    @Column(name = "tensanpham")
    private String tenSanPham;

    @Column(name = "anh")
    private String Anh;

    @Column(name = "gia")
    private String Gia;

    @Column(name = "mota")
    private String moTa;

    @Column(name = "kichthuoc")
    private String kichThuoc;

    @Column(name = "trongluong")
    private String trongLuong;

    @Column(name = "dophangiai")
    private String doPhanGiai;

    @Column(name = "boxuly")
    private String boXuLy;

    @Column(name = "ram")
    private String Ram;

    @Column(name = "dungluongpin")
    private String dungLuongPin;

    @Column(name = "dungluongbonho")
    private String dungLuongBoNho;

    @Column(name = "ngayramat")
    private String ngayRaMat;

    @Column(name = "thongtinbaohanh")
    private String thongTinBaoHanh;

    @Column(name = "soluongnhap")
    private String soLuongNhap;

    @Column(name = "soluongton")
    private String soLuongTon;
}
