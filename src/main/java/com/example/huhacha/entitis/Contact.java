package com.example.huhacha.entitis;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

    @NoArgsConstructor
    @Entity
    @Table(name = "Contact", catalog = "huhacha")
    public class Contact implements Serializable {

        private static final long serialVersionUID = 1L;

        @Column(name = "ID")
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private short id;

        @Column(name = "Email", length = 50, nullable = false, unique = true)
        private String email;

        @Column(name = "DATECONTACT", nullable = false)
        private Date  dateContact;

        @Column(name = "DATEREPLY", nullable = false)
        private Date  dateReply;

        @Column(name = "CONTENTCONTACT",length = 255 , nullable = false)
        private String  contenContact;

        @Column(name = "CONTENTREPLY",length = 255 , nullable = false)
        private String  contentReply;

        @Column(name = "STATUS",length = 50 , nullable = false)
        private String  status;

        @Column(name = "ID_USER",length = 10 , nullable = false)
        private short id_user;
    }

