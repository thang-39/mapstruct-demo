package com.example.mapstruct.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductDto {

    private int id;
    private String name;
//    private String desc; //don't have desc
    private int quantity;
    private long price;

}
