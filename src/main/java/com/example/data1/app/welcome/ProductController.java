package com.example.data1.app.welcome;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.example.data1.domain.dto.ProductDto;
import com.example.data1.domain.dto.UserDto;
import com.example.data1.domain.repository.ProductRepository;
import com.example.data1.domain.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    private final ProductRepository productRepository;

    @RequestMapping(value = "Products", method = RequestMethod.GET)
    public String home (Model model, HttpSession session, RedirectAttributes redirectAttributes){
        List<ProductDto> list1 = productService.getProducts();
        model.addAttribute("list",list1);
        model.addAttribute("session",session);
        return "welcome/home";
    }
//    public List<ProductDto> getProducts() {
//        return productService.getProducts();
//    }

}
