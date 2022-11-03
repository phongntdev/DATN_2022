package com.example.huhacha.entitis;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "USER_ROLE", catalog = "huhacha")
public class User_role implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;

    @Column(name = "ID_USER", length = 10, nullable = false, unique = true)
    private short idUser;

    @Column(name = "ID_ROLE", length = 10, nullable = false, unique = true)
    private short idRole;
}
