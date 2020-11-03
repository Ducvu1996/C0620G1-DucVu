package com.ducvu.controller;

import com.ducvu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"/book", ""})
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping(method = RequestMethod.GET)
    public String goListBool(Model model){
        model.addAttribute("listBook",this.bookService.findAll());
        return "list_bool_available";
    }
}
