package com.example.huhacha.DTO;

import io.swagger.annotations.ApiModel;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@ApiModel()
public class OrderDto extends AbstractDto<Long> {
    private Long id;
    private long serialVersionUID;
    @NotNull
    private short idOder;
    @NotNull
    private short idProduct;
//    @CheckDate chua tim ra
    @NotNull
    private Date creationDate;
//    @CheckDate
    @NotNull
    private Date deliveryDate;
//    @CheckMobile
    @NotNull
    private short phoneNumber;
    @Size(max = 50)
    @NotBlank
    private String status;
    @Size(max = 10)
    @NotBlank
    private String codeOfSale;

    public OrderDto() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setSerialVersionUID(long serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }

    public long getSerialVersionUID() {
        return this.serialVersionUID;
    }

    public void setIdOder(short idOder) {
        this.idOder = idOder;
    }

    public short getIdOder() {
        return this.idOder;
    }

    public void setIdProduct(short idProduct) {
        this.idProduct = idProduct;
    }

    public short getIdProduct() {
        return this.idProduct;
    }

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    public void setDeliveryDate(java.util.Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public java.util.Date getDeliveryDate() {
        return this.deliveryDate;
    }

    public void setPhoneNumber(short phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public short getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setCodeOfSale(String codeOfSale) {
        this.codeOfSale = codeOfSale;
    }

    public String getCodeOfSale() {
        return this.codeOfSale;
    }
}