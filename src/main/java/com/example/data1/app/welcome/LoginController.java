package com.example.data1.app.welcome;

import com.example.data1.domain.dto.ProductDto;
import com.example.data1.domain.dto.UserDto;
import com.example.data1.domain.model.UserModel;
import com.example.data1.domain.service.ProductService;
import com.example.data1.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("login1")
@RequiredArgsConstructor
public class LoginController {
    private final UserService userService;
    @RequestMapping(value = "/")
    public String formLogin(@ModelAttribute("loginForm") UserModel form, Model model) {
        return "login/index";
    }
    @RequestMapping(value ="/" , method = RequestMethod.POST , params ="confirm")
    public String createConfirm(@Validated LoginForm form, BindingResult result,
                                Model model) {
        String username = form.getUsername();
        String password = form.getPassword();
        if (username.isEmpty() || password.isEmpty()) {
            return Error(form, model);
        }
        final UserDto user = userService.getUser(username);
        if(user == null){
            return Error1(form, model);
        }
        if(!user.getPassword().equals(password)){
            return Error1(form, model);
        }
        return "redirect:/Products";
    }
    @RequestMapping(value = "login1", method = RequestMethod.POST)
    private String Error(@ModelAttribute("loginForm") LoginForm form, Model model) {
        model.addAttribute("errorUn","Username is missing!");
        model.addAttribute("errorPw","Password is missing!");
        return "login/index";
    }
    private String Error1(@ModelAttribute("loginForm") LoginForm form, Model model) {
        model.addAttribute("wrong","Username or Password is wrong!");
        return "login/index";
    }

}
