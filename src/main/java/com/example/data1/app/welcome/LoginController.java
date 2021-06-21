package com.example.data1.app.welcome;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("login1")
@RequiredArgsConstructor
public class LoginController {
    private final ProductController productController;
    @RequestMapping(value = "/")
    public String formLogin(@ModelAttribute("loginForm") LoginForm form, Model model) {
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
        return productController.home(model);
    }
    @RequestMapping(value = "login1", method = RequestMethod.POST)
    private String Error(@ModelAttribute("loginForm") LoginForm form, Model model) {
        model.addAttribute("errorUn","Username is missing!");
        model.addAttribute("errorPw","Password is missing!");
        return "login/index";
    }

}
