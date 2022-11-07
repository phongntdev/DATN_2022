package com.example.huhacha.entitis;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "ROLE", catalog = "huhacha")
public class Role implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;

    @Column(name = "NAME",length = 30 , nullable = false, unique = true)
    private String name;
}
