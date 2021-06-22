package com.example.data1.app.welcome;

import com.example.data1.domain.dto.BaseResponse;
import com.example.data1.domain.dto.OrderDto;
import com.example.data1.domain.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RequestMapping("Orders")
@Controller
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @GetMapping("{id}")
    public ResponseEntity<BaseResponse> getOrders(@PathVariable String id){
        final OrderDto orderDto = orderService.getOrder(id);
        return ResponseEntity.ok(BaseResponse.ok(orderDto));
    }
//    @PostMapping
//    public ResponseEntity<BaseResponse> createOrder(@Valid @RequestBody final CreateOrder request){
//        final OrderDto orderDto = orderService.getOrder(request);
//        orderService.createOrder(request);
//        return ResponseEntity.ok(BaseResponse.ok());
//    }
}
