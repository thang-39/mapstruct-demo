package com.example.mapstruct.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class Product {

    @Id
    private int id;
    private String name;
    private String desc;
    private int quantity;
    private long price;

}