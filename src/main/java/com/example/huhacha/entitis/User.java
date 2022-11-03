package com.example.huhacha.entitis;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "User", catalog = "huhacha")
public class User  implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;

    @Column(name = "NAME",length = 50 , nullable = false, unique = true)
    private String name;

    @Column(name = "DATE", nullable = false, unique = true)
    private Date date;

    @Column(name = "SEX", nullable = false, unique = true)
    private boolean sex;

    @Column(name = "ADDRESS",length = 100 , nullable = false, unique = true)
    private String  address;

    @Column(name = "PHONENUMBER",length = 10 , nullable = false, unique = true)
    private short phoneNumber;

    @Column(name = "EMAIL",length = 50 , nullable = false, unique = true)
    private String email;

    @Column(name = "PASSWORD",length = 50 , nullable = false, unique = true)
    private String password;
}
