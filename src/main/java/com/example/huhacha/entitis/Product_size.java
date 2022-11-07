package com.example.huhacha.entitis;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "PRODUCT_SIZE", catalog = "huhacha")
public class Product_size implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;

    @Column(name = "ID_PRODUCT", length = 10, nullable = false, unique = true)
    private short id_product;

    @Column(name = "ID_SIZE", length = 10, nullable = false, unique = true)
    private short id_size;
}
