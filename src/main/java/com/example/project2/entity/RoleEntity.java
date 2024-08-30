package com.example.project2.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "danhmuc")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idrole")
    private Long idrole;

    @Column(name = "ten")
    private String Ten;

    @Column(name = "mo ta")
    private String moTa;

}
