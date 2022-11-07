package com.example.huhacha.entitis;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

    @NoArgsConstructor
    @Entity
    @Table(name = "Cart", catalog = "huhacha")
    public class Cart implements Serializable {

        private static final long serialVersionUID = 1L;

        @Column(name = "ID")
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private short id;

        @Column(name = "ID_USER", length = 10, nullable = false, unique = true)
        private short id_user;

    }


