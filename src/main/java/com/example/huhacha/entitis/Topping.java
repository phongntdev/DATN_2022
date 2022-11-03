package com.example.huhacha.entitis;

import javax.persistence.*;
import java.io.Serializable;
@Table(name = "TOPPING", catalog = "huhacha")
@Entity
public class Topping implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;

    @Column(name = "NAME",length = 50 , nullable = false, unique = true)
    private String name;

    @Column(name = "MONEY",length = 10 , nullable = false, unique = true)
    private long  money;
}