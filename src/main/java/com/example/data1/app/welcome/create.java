package com.example.data1.app.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("abc")
public class create {
//    @ModelAttribute
//    public AbcForm setUpAbcForm() {
//        return new abcForm();
//    }
    @RequestMapping(value = "creatForm", params = "form")
    public String createForm(@ModelAttribute("abcForm") AbcForm form, Model model) {
        // omitted
        return "abc/form"; // (2)
    }
    @RequestMapping(value = "create", method = RequestMethod.POST,params = "confirm")
    public String createConfirm(@Validated AbcForm form, BindingResult result,
                                Model model) {
        if (result.hasErrors()) {
            return createRedo(form, model);
        }
        return "abc/createForm";
    }
    @RequestMapping(value = "create", method = RequestMethod.POST,params = "redo")
    private String createRedo(@ModelAttribute("abcForm") AbcForm form, Model model) {
        return "abc/form";
    }
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String create123(@Validated AbcForm form, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return createRedo(form, model);
        }
        return "redirect:/abc/create?complete";
    }
    @RequestMapping(value = "create", params = "complete")
    public String createComplete() {
        // omitted
        return "abc/createForm";
    }
}
