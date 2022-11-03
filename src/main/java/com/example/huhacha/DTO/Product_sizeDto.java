package com.example.huhacha.DTO;

import io.swagger.annotations.ApiModel;

import javax.validation.constraints.NotNull;

@ApiModel()
public class Product_sizeDto extends AbstractDto<Long> {
    private long serialVersionUID;
    private short id;
    @NotNull
    private short id_product;
    @NotNull
    private short id_size;

    public Product_sizeDto() {
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

    public void setId_product(short id_product) {
        this.id_product = id_product;
    }

    public short getId_product() {
        return this.id_product;
    }

    public void setId_size(short id_size) {
        this.id_size = id_size;
    }

    public short getId_size() {
        return this.id_size;
    }
}