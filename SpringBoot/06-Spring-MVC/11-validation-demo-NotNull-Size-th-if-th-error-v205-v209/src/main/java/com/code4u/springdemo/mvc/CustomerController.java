package com.code4u.springdemo.mvc;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {
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
            return "customer_form";
        }
        return "customer_response";
    }
}
