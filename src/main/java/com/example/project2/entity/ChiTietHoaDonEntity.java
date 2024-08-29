package com.example.project2.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "chitiethoadon")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ChiTietHoaDonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idHoaDon;

    @Column(name = "iduser")
    private Long idUser;

    @Column(name = "idsanpham")
    private Long idSanPham;

    @Column(name = "idphuongthucthanhtoan")
    private Long idPhuongThucThanhToan;

    @Column(name = "ngayinhoadon")
    private String ngayInHoaDon;

    @Column(name = "thue")
    private String thue;

    @Column(name = "trangthai")
    private String trangThai;

    @Column(name = "tongtienthanhtoan")
    private String tongTienThanhToan;
}
