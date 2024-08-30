package com.example.project2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "iduser")
    private Long iduser;

    @Column(name = "ten")
    private String Ten;

    @Column(name = "ngay sinh")
    private String ngaySinh;

    @Column(name = "gioi tinh")
    private String gioiTinh;

    @Column(name = "dia chi")
    private String diaChi;

    @Column(name = "so dien thoai")
    private String soDienThoai;

    @Column(name = "mail")
    private String mail;

    @Column(name = "password")
    private String passWord;

    @Column(name = "username")
    private String userName;
}
