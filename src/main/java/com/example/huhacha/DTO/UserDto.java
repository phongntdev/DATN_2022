package com.example.huhacha.DTO;

import io.swagger.annotations.ApiModel;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@ApiModel()
public class UserDto extends AbstractDto<Long> {
    private long serialVersionUID;
    private short id;
    @Size(max = 50)
    @NotBlank
    private String name;
//    @CheckDate
    @NotNull
    private Date date;
    @NotNull
    private boolean sex;
    @Size(max = 100)
    @NotBlank
    private String address;
//    @CheckMobile
    @NotNull
    private short phoneNumber;
//    @CheckEmail
    @Size(max = 50)
    @NotBlank
    private String email;
    @Size(max = 50)
    @NotBlank
    private String password;

    public UserDto() {
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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    public java.util.Date getDate() {
        return this.date;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public boolean getSex() {
        return this.sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setPhoneNumber(short phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public short getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }
}