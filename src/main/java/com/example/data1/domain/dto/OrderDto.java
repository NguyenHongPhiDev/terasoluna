package com.example.data1.domain.dto;

import com.example.data1.domain.constant.OrderStatus;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderDto extends  BaseDto{
    private String id;
    private String userId;
    private Integer amount;
    private OrderStatus status;
}
