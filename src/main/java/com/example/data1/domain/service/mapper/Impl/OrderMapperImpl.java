package com.example.data1.domain.service.mapper.Impl;

import com.example.data1.domain.dto.OrderDto;
import com.example.data1.domain.dto.OrderResponse;
import com.example.data1.domain.model.OrderModel;
import com.example.data1.domain.service.mapper.OrderMapper;
import org.springframework.stereotype.Component;



@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public OrderDto toOrderDto(OrderModel orderModel) {
        if ( orderModel == null ) {
            return null;
        }

        OrderDto orderDto = new OrderDto();

        orderDto.setId( orderModel.getId() );
        orderDto.setCreatedAt( orderModel.getCreatedAt() );
        orderDto.setUpdatedAt( orderModel.getUpdatedAt() );
        orderDto.setUserId( orderModel.getUserId() );
        orderDto.setAmount( orderModel.getAmount() );
        orderDto.setStatus( orderModel.getStatus() );

        return orderDto;
    }

    @Override
    public OrderResponse toOrderResponse(OrderDto orderDto) {
        if ( orderDto == null ) {
            return null;
        }

        OrderResponse orderResponse = new OrderResponse();

        if ( orderDto.getId() != null ) {
            orderResponse.setId( Integer.parseInt( orderDto.getId() ) );
        }
        orderResponse.setAmount( orderDto.getAmount() );

        return orderResponse;
    }
}
