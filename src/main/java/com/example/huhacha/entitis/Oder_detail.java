package com.example.huhacha.entitis;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;



    @NoArgsConstructor
    @Entity
    @Table(name = "order_detail", catalog = "huhacha")
    public class Oder_detail implements Serializable {

        private static final long serialVersionUID = 1L;

        @Column(name = "ID",length = 10, nullable = false)
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private short id;

        @Column(name = "ID_ORDER", length = 10, nullable = false, unique = true)
        private short idOder;

        @Column(name = "ID_PRODUCT", length = 10, nullable = false, unique = true)
        private short idProduct;

        @Column(name = "ID_TOPPING", length = 10, nullable = false, unique = true)
        private short idTopping;

        @Column(name = "SUGAR",length = 3 , nullable = false, unique = true)
        private short  sugar;

        @Column(name = "ICECOLD",length = 3 , nullable = false, unique = true)
        private short  icecold;

        @Column(name = "AMOUNT",length = 3 , nullable = false, unique = true)
        private short  amount;

        @Column(name = "MONEY",length = 10 , nullable = false, unique = true)
        private long monney;
    }

