package com.example.data1.domain.service.mapper.Impl;

import com.example.data1.domain.dto.ProductDto;
import com.example.data1.domain.model.ProductModel;
import com.example.data1.domain.service.mapper.ProductMapper;
import org.springframework.stereotype.Component;



@Component
public class ProductMapperImpl implements ProductMapper {
    @Override
    public ProductDto toProductDto(ProductModel productModel) {
        if ( productModel == null ) {
            return null;
        }
        ProductDto productDto = new ProductDto();
        productDto.setId( productModel.getId() );
        productDto.setCode( productModel.getCode() );
        productDto.setName( productModel.getName() );
        productDto.setAmount( productModel.getAmount() );
        productDto.setStatus( productModel.getStatus() );

        return productDto;
    }
}