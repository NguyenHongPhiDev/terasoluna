package com.example.data1.app.welcome;

import com.example.data1.domain.dto.BaseResponse;
import com.example.data1.domain.dto.OrderDto;
import com.example.data1.domain.dto.ProductDto;
import com.example.data1.domain.service.OrderService;
import com.example.data1.domain.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RequestMapping("Orders")
@Controller
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    private final ProductService productService;

    @GetMapping("{id}")
    public String getOrders(@PathVariable Integer id, Model model){
        final ProductDto orderDto = productService.getProduct(id);
        model.addAttribute("order",orderDto);
        return "welcome/order";
    }
//    @PostMapping
//    public ResponseEntity<BaseResponse> createOrder(@Valid @RequestBody final CreateOrder request){
//        final OrderDto orderDto = orderService.getOrder(request);
//        orderService.createOrder(request);
//        return ResponseEntity.ok(BaseResponse.ok());
//    }
}
