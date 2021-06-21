package com.example.data1.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ProductDto implements Serializable {
    private Integer id;
    private String code;
    private String name;
    private Integer amount;
    private String status;
}
