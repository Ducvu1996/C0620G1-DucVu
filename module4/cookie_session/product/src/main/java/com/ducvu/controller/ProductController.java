package com.ducvu.controller;

import com.ducvu.entity.Product;
import com.ducvu.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping({"/product",""})

public class ProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping("/")
    public String index(Model model, RedirectAttributes redirectAttributes){

        List<Product> products = productService.findAll();
        model.addAttribute("products",products);

        return "list";
    }


}
