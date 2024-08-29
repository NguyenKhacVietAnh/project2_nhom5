package com.example.project2.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "phuongthucthanhtoan")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class PhuongThucThanhToanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPhuongThucThanhToan;

    @Column(name = "iduser")
    private Long idUser;

    @Column(name = "tenphuongthucthanhtoan")
    private String tenPhuongThucThanhToan;

    @Column(name = "ngaythanhtoan")
    private String ngayThanhToan;

    @Column(name = "ngayinhoadon")
    private String soTienThanhToan;

    @Column(name = "trangthai")
    private String trangThai;
}
