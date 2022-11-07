package com.example.huhacha.entitis;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "PRODUCT", catalog = "huhacha")
public class Product implements Serializable {
    @Id
    @Column(name = "id", nullable = false, length = 10 , unique = true)
    private Long id;

    private static final long serialVersionUID = 1L;

    @Column(name = "ID_CATELOGY", length = 10, nullable = false, unique = true)
    private short idCatelogy;

    @Column(name = "NAME",length = 50 , nullable = false, unique = true)
    private String name;

    @Column(name = "CONTENT",length = 255 , nullable = false, unique = true)
    private String  content;

    @Column(name = "IMAGE",length = 255 , nullable = false, unique = true)
    private String  image;

    @Column(name = "MONEY",length = 10 , nullable = false, unique = true)
    private long  money;

}
