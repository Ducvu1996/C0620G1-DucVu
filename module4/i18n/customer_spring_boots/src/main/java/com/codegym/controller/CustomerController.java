package com.codegym.controller;

import com.codegym.entity.Customer;
import com.codegym.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Stack;

@Controller
@RequestMapping({"/customer",""})

public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET)
    public String goListCustomer(Model model) {
        model.addAttribute("listCustomer", customerService.findAll());
        return "list_customer";
    }
    @GetMapping("/detail")
    public String goDetailCustomer(@RequestParam Integer id, Model model) {
        model.addAttribute("customerDetail", customerService.findById(id));
        return "detail_customer";
    }
    @GetMapping("/detail/{idCustomer}")
    public String goDetailCustomerPathVariable(@PathVariable(value = "idCustomer") Integer id, Model model) {
        model.addAttribute("customerDetail", customerService.findById(id));
        return "detail_customer";

    }

    @GetMapping("/create")
    public String goCreateCustomer(Model model) {
        model.addAttribute("customer", new Customer());

        return "create_customer";
    }

    @PostMapping("/create")
    public String createCustomer(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes) {

        this.customerService.save(customer);
        redirectAttributes.addFlashAttribute("message", "Create customer !");

        return "redirect:/customer";
    }

    @GetMapping("/update")
    public String goUpdateCustomer(Model model, @RequestParam Integer id) {
        model.addAttribute("customer", this.customerService.findById(id));

        return "update_customer";
    }

    @PostMapping("/update")
    public String updateCustomer(@ModelAttribute Customer customer) {
        this.customerService.save(customer);

        return "redirect:/";
    }
}
