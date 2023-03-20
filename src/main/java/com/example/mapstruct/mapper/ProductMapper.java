package com.example.mapstruct.mapper;

import com.example.mapstruct.dto.ProductDto;
import com.example.mapstruct.entity.Product;
import com.example.mapstruct.validator.ProductValidationException;
import com.example.mapstruct.validator.ProductValidator;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.UUID;

@Mapper(uses = {ProductValidator.class},
        componentModel = "spring",
        imports = UUID.class)
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    @Mapping(source = "product.desc", target = "description", defaultValue = "description")
    ProductDto modelToDto(Product product) throws ProductValidationException;

    List<ProductDto> modelsToDtos(List<Product> product) throws ProductValidationException;

    @InheritInverseConfiguration
    Product dtoToModel(ProductDto productDto) throws ProductValidationException;


}
