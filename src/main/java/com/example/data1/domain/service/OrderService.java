package com.example.data1.domain.service;

import com.example.data1.domain.constant.OrderStatus;
import com.example.data1.domain.dto.OrderDto;
import com.example.data1.domain.dto.ProductDto;
import com.example.data1.domain.dto.Request.CreateOrder;
import com.example.data1.domain.exception.BadRequestException;
import com.example.data1.domain.model.OrderModel;
import com.example.data1.domain.model.UserModel;
import com.example.data1.domain.repository.OrderRepository;
import com.example.data1.domain.service.mapper.OrderMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderService {
    private  final OrderRepository orderRepository;
    private final  ProductService productService;
    private final  UserService userService;
    private final OrderMapper orderMapper;


    public OrderDto getOrder(final String id){
        return orderRepository
                .findById(id)
                .map(orderMapper::toOrderDto)
                .orElseGet(()->{
                    log.warn("order not found. Id: {}.",id);
                    throw new BadRequestException("order not found. ID : "+id);
                });
    }
    @Transactional
    public void createOrder(final CreateOrder request){
        final ProductDto product = productService.getProduct(request.getProductId());
        final UserModel user = userService.getUserById(request.getUserId());
        if(user.getBalance()<product.getAmount()){
            log.warn("User {} don't have enough balance",user.getUsername());
            throw new BadRequestException("Balance not enough");
        }
        final OrderModel orderModel = new OrderModel();
        orderModel.setId(UUID.randomUUID().toString());
        orderModel.setUserId(user.getId());
        orderModel.setStatus(OrderStatus.PAID);
        orderModel.setAmount(product.getAmount());
        user.deduct(product.getAmount());

        orderRepository.save(orderModel);

    }

}
