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
public class ManagerUserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "iduser")
    private Long iduser;

    @Column(name = "idrole")
    private Long idRole;
}
