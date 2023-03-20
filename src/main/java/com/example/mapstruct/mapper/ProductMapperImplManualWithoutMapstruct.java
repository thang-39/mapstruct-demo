package com.example.mapstruct.mapper;

import com.example.mapstruct.dto.ProductDto;
import com.example.mapstruct.entity.Product;

public class ProductMapperImplManualWithoutMapstruct /*implements ProductMapper*/{
//    @Override
    public ProductDto modelToDto(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setName(product.getName());
        productDto.setPrice(product.getPrice());
        productDto.setQuantity(product.getQuantity());
        return productDto;
    }

//    @Override
    public Product dtoToModel(ProductDto productDto) {
        Product product = new Product();
        product.setId(productDto.getId());
        product.setName(productDto.getName());
        product.setQuantity(product.getQuantity());
        product.setPrice(product.getPrice());
        return product;
    }
}
