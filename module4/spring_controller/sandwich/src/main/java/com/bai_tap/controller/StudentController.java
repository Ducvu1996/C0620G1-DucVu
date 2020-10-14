package com.bai_tap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"/student"})
public class StudentController {
    @RequestMapping(method = RequestMethod.GET)
    public String example(Model model){
        return "hello";
    }
}
