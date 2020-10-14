package com.bai_tap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping({"/calculator",""})
public class CalculatorController {
    @RequestMapping(method = RequestMethod.GET)
    public String show(Model model){
        return "calculator";
    }
    @RequestMapping("/result")
    public String calculator(@RequestParam("operator") String operator,String number1,String number2, Model model ){
        double numberOne = Double.parseDouble(number1);
        double numberTwo = Double.parseDouble(number2);
        double result = 0;
        if(operator.equals("+")){
            result = numberOne+ numberTwo;
        }else if (operator.equals("-")){
            result = numberOne- numberTwo;
        }else if (operator.equals("*")){
            result = numberOne*numberTwo;
        }else if (operator.equals("/")){
            result = numberOne/numberTwo;
        }
        model.addAttribute("result",result);
        return "calculator";
    }
}
