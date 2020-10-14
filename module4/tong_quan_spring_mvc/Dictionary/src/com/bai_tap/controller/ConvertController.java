package com.bai_tap.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @GetMapping("/")
    public String formConvert(){
        return "formConvert";
    }

    @GetMapping("/convert")
    public String convert(@RequestParam String mount, Model model){
        double result =Double.parseDouble(mount)*23000;
        model.addAttribute("result",result);
        return "formConvert";
    }
}
