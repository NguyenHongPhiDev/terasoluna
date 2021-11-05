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
public class abcd {
    @ModelAttribute
    public AbcForm setUpAbcForm() {
        return new AbcForm();
    }

    // Handling request of "/abc/create?form"
    @RequestMapping(value = "create", params = "form")
    public String createForm(AbcForm form, Model model) {
        // omitted
        return "abc/createForm";
    }

    // Handling request of "POST /abc/create?confirm"
    @RequestMapping(value = "create", method = RequestMethod.POST, params = "confirm")
    public String createConfirm(@Validated AbcForm form, BindingResult result,
                                Model model) {
        if (result.hasErrors()) {
            return createRedo(form, model);
        }
        // omitted
        return "abc/createConfirm";
    }

    // Handling request of "POST /abc/create?redo"
    @RequestMapping(value = "create", method = RequestMethod.POST, params = "redo")
    public String createRedo(AbcForm form, Model model) {
        // omitted
        return "abc/createForm";
    }

    // Handling request of "POST /abc/create"
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String create(@Validated AbcForm form, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return createRedo(form, model);
        }
        // omitted
        return "redirect:/abc/create?complete";
    }

    // Handling request of "/abc/create?complete"
    @RequestMapping(value = "create", params = "complete")
    public String createComplete() {
        // omitted
        return "abc/createComplete";
    }

}
