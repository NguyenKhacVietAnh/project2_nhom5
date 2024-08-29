package com.example.project2.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "MauSac")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class MauSacEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idmausac")
    private Long idaMauSac;

    @Column(name = "tenmau")
    private String tenMau;
}
