package com.example.mapstruct.controller;

import com.example.mapstruct.dto.ProductDto;
import com.example.mapstruct.entity.Product;
import com.example.mapstruct.mapper.ProductMapper;
import com.example.mapstruct.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductMapper productMapper;
    private final ProductRepository productRepository;

    @PostMapping
    public ResponseEntity<Product> save(@RequestBody ProductDto productDto) {
        return new ResponseEntity<>(productRepository.save(
                productMapper.dtoToModel(productDto)), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ProductDto>> findAll() {
        return new ResponseEntity<>(productMapper.modelsToDtos(productRepository.findAll()),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> findById(@PathVariable(value = "id") int id) {
        return new ResponseEntity<>(productMapper.modelToDto(productRepository.findById(id).get()),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable int id) {
        productRepository.deleteById(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }


}
