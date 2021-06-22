package com.example.data1.domain.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderResponse {
    private Integer id;
    private String code;
    private String name;
    private Integer amount;
}
