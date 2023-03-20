package com.example.mapstruct.mapper;

import com.example.mapstruct.dto.ProductDto;
import com.example.mapstruct.entity.Product;

public interface ProductMapper {

    ProductDto modelToDto(Product product);

    Product dtoToModel(ProductDto productDto);
}
