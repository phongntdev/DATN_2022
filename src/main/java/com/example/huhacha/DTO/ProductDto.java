package com.example.huhacha.DTO;

import com.sun.istack.NotNull;
import io.swagger.annotations.ApiModel;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@ApiModel()
public class ProductDto extends AbstractDto<Long> {
    private Long id;
    private long serialVersionUID;
    @NotNull
    private short idCatelogy;
    @Size(max = 50)
    @NotBlank
    private String name;
    @Size(max = 255)
    @NotBlank
    private String content;
    @Size(max = 255)
    @NotBlank
    private String image;
    @NotNull
    private long money;

    public ProductDto() {
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

    public void setIdCatelogy(short idCatelogy) {
        this.idCatelogy = idCatelogy;
    }

    public short getIdCatelogy() {
        return this.idCatelogy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return this.image;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public long getMoney() {
        return this.money;
    }
}