package com.example.data1.app.welcome;

import com.example.data1.domain.dto.BaseResponse;
import com.example.data1.domain.dto.Request.CreateOrder;
import com.example.data1.domain.service.OrderService;
import com.example.data1.domain.service.mapper.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("Orders")
@RestController
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    private final OrderMapper orderMapper;

//    @GetMapping("{id}")
//    public ResponseEntity<BaseResponse> getOrders(@PathVariable String id){
//        final OrderDto orderDto = orderService.getOrder(id);
//        return ResponseEntity.ok(BaseResponse.ok(orderDto));
//    }
    @PostMapping
    public ResponseEntity<BaseResponse> createOrder(@Valid @RequestBody final CreateOrder request){
//        final OrderDto orderDto = orderService.getOrder(request);
        orderService.createOrder(request);
        return ResponseEntity.ok(BaseResponse.ok());
    }
}
