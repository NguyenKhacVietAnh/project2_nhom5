package com.example.project2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "danhgia")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class DanhGiaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idDanhGia")
    private Long idDanhGia;

    @Column(name = "idUser")
    private String idUser;

    @Column(name = "idSanPham")
    private String isSanPham;

    @Column(name = "DanhGiaSao")
    private String DanhGiaSao;

    @Column(name = "ListItem")
    private String ListItem;

    @Column(name = "NgayDanhGia")
    private String NgayDanhGia;

    @Column(name = "TrangThai")
    private String TrangThai;

}
