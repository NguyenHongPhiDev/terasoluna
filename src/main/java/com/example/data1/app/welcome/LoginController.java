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
        if (result.hasErrors()) {
            return Error(form, model);
        }
        String username = form.getUsername();
        String password = form.getPassword();
        System.out.println(username);
        System.out.println(password);
        return productController.home(model);
    }
    @RequestMapping(value = "create", method = RequestMethod.POST,params = "redo")
    private String Error(@ModelAttribute("loginForm") LoginForm form, Model model) {
        model.addAttribute("errorusername","Username not null!");
//        model.addAttribute("")
        return "login/index";
    }

}
