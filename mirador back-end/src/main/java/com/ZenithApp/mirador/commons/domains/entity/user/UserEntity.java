package com.ZenithApp.mirador.commons.domains.entity.user;

import jakarta.persistence.*;
import lombok.*;

@Builder(builderMethodName = "newInstance")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "user_mirador")
public class UserEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name= "emailVerified")
    private String emailVerified;

    @Column(name = "rol")
    private String rol;

    @Column(name = "image")
    private String image;
}
