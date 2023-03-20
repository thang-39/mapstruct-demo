package com.example.mapstruct.dto;

import com.example.mapstruct.entity.Item;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ProductDto {

    private int id;
    private String name;
    private String description;
    private int quantity;
    private long price;
    private String itemId;

    private List<Item> itemsList;

}
