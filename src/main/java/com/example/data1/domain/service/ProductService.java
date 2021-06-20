package com.example.data1.domain.service;
import com.example.data1.domain.dto.ProductDto;
import com.example.data1.domain.repository.ProductRepository;
import com.example.data1.domain.service.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductMapper productMapper;
    private  final ProductRepository productRepository ;
    public List<ProductDto> getProducts(){
        return productRepository
                .findAll()
                .stream()
                .map(productMapper::toProductDto)
                .collect(Collectors.toList());
    }

//    public ProductDto getProduct(final Integer id){
//        return productRepository
//                .findProductModelById(id)
//                .map(productMapper::toProductDto)
//                .orElseGet(()->{
//                    log.warn("products not found. Id: {}.",id);
//                    throw  new RuntimeException("product not found. ID : "+id);
//                });
//    }

}
