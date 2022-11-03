package com.example.huhacha.entitis;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@Entity
@Table(name = "order", catalog = "huhacha")
public class Order implements Serializable {
    @Id
    @Column(name = "id", nullable = false, length = 10 , unique = true)
    private Long id;

    private static final long serialVersionUID = 1L;

    @Column(name = "ID_USER", length = 10, nullable = false, unique = true)
    private short idOder;

    @Column(name = "ID_SHIPPER", length = 10, nullable = false, unique = true)
    private short idProduct;

    @Column(name = "CREATIONDATE", nullable = false, unique = true)
    private Date creationDate;

    @Column(name = "DELIVERYDATE", nullable = false, unique = true)
    private Date  deliveryDate;

    @Column(name = "PHONENUMBER",length = 10 , nullable = false, unique = true)
    private short  phoneNumber;

    @Column(name = "STATUS",length = 50 , nullable = false, unique = true)
    private String  status;

    @Column(name = "CODEOFSALE",length = 10 , nullable = false, unique = true)
    private String codeOfSale;

}
