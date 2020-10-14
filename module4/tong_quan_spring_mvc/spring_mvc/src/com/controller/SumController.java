package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SumController {
    @GetMapping("/")
    public String Hello(){
        return "index";
    }
    @GetMapping("/form")
    public String formSum (){

        return "form";
    }
    @PostMapping("/result")
    public String result(@RequestParam String num_1, @RequestParam String num_2, Model model){

        double resultSum =Double.parseDouble(num_1) + Double.parseDouble(num_2);
        model.addAttribute("resultSum",resultSum);
        return "result";
    }
}
