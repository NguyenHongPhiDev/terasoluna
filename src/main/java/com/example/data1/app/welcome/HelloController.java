package com.example.data1.app.welcome;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.example.data1.domain.dto.ProductDto;
import com.example.data1.domain.repository.ProductRepository;
import com.example.data1.domain.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequiredArgsConstructor
public class HelloController {
    private final ProductService productService;
    private final ProductRepository productRepository;
    @RequestMapping(value = "Products",method = RequestMethod.GET)
    public List<ProductDto> getProducts(){
        return productService.getProducts();
    }

}
