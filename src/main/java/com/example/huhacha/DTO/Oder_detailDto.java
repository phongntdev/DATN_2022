package com.example.huhacha.DTO;

import io.swagger.annotations.ApiModel;

import javax.validation.constraints.NotNull;

@ApiModel()
public class Oder_detailDto extends AbstractDto<Long> {
    private long serialVersionUID;
    private short id;
    @NotNull
    private short idOder;
    @NotNull
    private short idProduct;
    @NotNull
    private short idTopping;
    @NotNull
    private short sugar;
    @NotNull
    private short icecold;
    @NotNull
    private short amount;
    @NotNull
    private long monney;

    public Oder_detailDto() {
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

    public void setIdTopping(short idTopping) {
        this.idTopping = idTopping;
    }

    public short getIdTopping() {
        return this.idTopping;
    }

    public void setSugar(short sugar) {
        this.sugar = sugar;
    }

    public short getSugar() {
        return this.sugar;
    }

    public void setIcecold(short icecold) {
        this.icecold = icecold;
    }

    public short getIcecold() {
        return this.icecold;
    }

    public void setAmount(short amount) {
        this.amount = amount;
    }

    public short getAmount() {
        return this.amount;
    }

    public void setMonney(long monney) {
        this.monney = monney;
    }

    public long getMonney() {
        return this.monney;
    }
}