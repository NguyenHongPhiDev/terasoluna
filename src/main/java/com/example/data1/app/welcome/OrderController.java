package com.example.data1.app.welcome;

import com.example.data1.domain.dto.BaseResponse;
import com.example.data1.domain.dto.OrderDto;
import com.example.data1.domain.dto.ProductDto;
import com.example.data1.domain.dto.Request.CreateOrder;
import com.example.data1.domain.service.OrderService;
import com.example.data1.domain.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;


@RequestMapping("Orders")
@Controller
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    private final ProductService productService;
    @GetMapping
    public String createOrder(final CreateOrder request, HttpSession session) {
        String sid = (String) session.getAttribute("user_id");
        Integer sid1 = (Integer) session.getAttribute("product");
//        final OrderDto orderDto = orderService.getOrder(request);
        request.setProductId(sid1);
        request.setUserId(sid);
        orderService.createOrder(request);
//        if(abc= false){
//            return "welcome/order";
//        }
        return "login/confirm";
    }
}
