package com.bai_tap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping({"/sandwich",""})
public class SandwichController {
    @RequestMapping(method = RequestMethod.GET)
    public String show(Model model){

        return "sandwichChoose";
    }
    @GetMapping("/result")
    public String showResult(@RequestParam("condiment") String[] condiment, Model model){
              String stringResult = "";
            if(condiment.length>0) {
                for (int i = 0; i < condiment.length; i++) {
                    stringResult += condiment[i];
                    stringResult += "\n";
                }
            }else {
                stringResult ="nothing condiment ";
            }
            model.addAttribute("condiment",stringResult);

        return "result";
    }
}
