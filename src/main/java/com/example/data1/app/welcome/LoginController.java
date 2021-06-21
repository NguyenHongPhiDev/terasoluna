package com.example.data1.app.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("login1")
public class LoginController {
    @RequestMapping(value = "/")
    public String formLogin(@ModelAttribute("loginForm") LoginForm form, Model model) {
        return "login/index";
    }
    @RequestMapping(value ="/" , method = RequestMethod.POST , params ="confirm")
    public String createConfirm(@Validated LoginForm form, BindingResult result,
                                Model model) {
        if (result.hasErrors()) {
            return formLogin(form, model);
        }
        if(form.getUsername().equals("Phi")&&form.getPassword().equals("123")){
            return "login/confirm";
        }
        return "login/index";
    }

}
