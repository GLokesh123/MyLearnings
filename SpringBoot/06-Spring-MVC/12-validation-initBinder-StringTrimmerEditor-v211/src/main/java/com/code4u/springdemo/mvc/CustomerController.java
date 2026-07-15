package com.code4u.springdemo.mvc;

import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;

@Controller
public class CustomerController {

    @InitBinder
    public void initBinder(WebDataBinder dataBinder)
    {
        StringTrimmerEditor strEditor=new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class,strEditor);
    }


    @GetMapping("/customer-form")
    public String getForm(Model model)
    {
        Customer customer=new Customer();
        model.addAttribute("customer",customer);

        return "customer_form";

    }

    @PostMapping("/customer-response")
    public String resp(@Valid @ModelAttribute Customer customer, BindingResult result)
    {
        if(result.hasErrors())
        {
            result.getFieldErrors().forEach(error -> {
                System.out.println("Field: " + error.getField());
                System.out.println("Code : " + error.getCode());
                System.out.println("Codes: " + Arrays.toString(error.getCodes()));
            });
            return "customer_form";
        }
        return "customer_response";
    }
}
