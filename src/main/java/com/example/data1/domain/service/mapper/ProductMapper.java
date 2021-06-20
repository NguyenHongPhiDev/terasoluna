package com.example.data1.domain.service.mapper;


import com.example.data1.domain.dto.ProductDto;
import com.example.data1.domain.model.ProductModel;

public interface ProductMapper {
    ProductDto toProductDto(final ProductModel productModel);
}
