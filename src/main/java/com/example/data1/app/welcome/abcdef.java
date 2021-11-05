package com.example.data1.app.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class abcdef {
    @ModelAttribute
    public AbcForm setUpAbcForm() {
        return new AbcForm();
    }
    @RequestMapping(value = "testInput" ,params = "form")
    public String registeraForm(AbcForm form){
        return "login/test";
    }
    @RequestMapping(value = "testInput" ,method = RequestMethod.POST,params = "confirm")
    public String registeraConfirm(AbcForm form){
        return "login/test1";
    }
    @RequestMapping(value = "testInput",method = RequestMethod.POST ,params = "redo")
    public String registeraRedo(AbcForm form){
        return "login/test";
    }
}
