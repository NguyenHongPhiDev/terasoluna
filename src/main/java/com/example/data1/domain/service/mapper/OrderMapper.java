package com.example.data1.domain.service.mapper;

import com.example.data1.domain.dto.OrderDto;
import com.example.data1.domain.model.OrderModel;

public interface OrderMapper {
    OrderDto toOrderDto(final OrderModel orderModel);

}
