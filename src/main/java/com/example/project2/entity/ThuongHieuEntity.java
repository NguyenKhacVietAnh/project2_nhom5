package com.example.project2.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "thuonghieu")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ThuongHieuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idthuonghieu")
    private Long idThuongHieu;

    @Column(name = "tenthuonghieu")
    private String tenThuongHieu;

    @Column(name = "mota")
    private String moTa;

    @Column(name = "logo")
    private String loGo;


}
