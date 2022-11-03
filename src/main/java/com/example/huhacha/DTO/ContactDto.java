package com.example.huhacha.DTO;

import io.swagger.annotations.ApiModel;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@ApiModel()
public class ContactDto extends AbstractDto<Long> {
    private long serialVersionUID;
    private short id;
//    @CheckEmail
    @Size(max = 50)
    @NotBlank
    private String email;
//    @CheckDate
    @NotNull
    private Date dateContact;
//    @CheckDate
    @NotNull
    private Date dateReply;
    @Size(max = 255)
    @NotBlank
    private String contenContact;
    @Size(max = 255)
    @NotBlank
    private String contentReply;
    @Size(max = 50)
    @NotBlank
    private String status;
    @NotNull
    private short id_user;

    public ContactDto() {
    }

    public void setSerialVersionUID(long serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }

    public long getSerialVersionUID() {
        return this.serialVersionUID;
    }

    public void setId(short id) {
        this.id = id;
    }

    public short getId() {
        return this.id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setDateContact(java.util.Date dateContact) {
        this.dateContact = dateContact;
    }

    public java.util.Date getDateContact() {
        return this.dateContact;
    }

    public void setDateReply(java.util.Date dateReply) {
        this.dateReply = dateReply;
    }

    public java.util.Date getDateReply() {
        return this.dateReply;
    }

    public void setContenContact(String contenContact) {
        this.contenContact = contenContact;
    }

    public String getContenContact() {
        return this.contenContact;
    }

    public void setContentReply(String contentReply) {
        this.contentReply = contentReply;
    }

    public String getContentReply() {
        return this.contentReply;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setId_user(short id_user) {
        this.id_user = id_user;
    }

    public short getId_user() {
        return this.id_user;
    }
}