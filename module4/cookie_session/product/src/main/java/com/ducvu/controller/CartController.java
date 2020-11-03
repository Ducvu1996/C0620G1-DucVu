package com.ducvu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes(value = "productCart")

public class CartController {
    @RequestMapping("/cart")
        public void addCart(){

    }

}
