package com.ducvu.controller;


import com.ducvu.entity.User;
import com.ducvu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping({"/user", ""})
public class UserController {
    @Autowired
    private UserService userService;



    @RequestMapping(method = RequestMethod.GET)
    public String listUser(Model model, @PageableDefault(size =2) Pageable pageable,
                           @RequestParam Optional<String> keyword){


        model.addAttribute("listUser", userService.findAll());

        model.addAttribute("user", new User());

        return "list_user";
    }
    @GetMapping("/create")
    public String ogCreateUser(Model model) {
        model.addAttribute("user", new User());
        return "createUser";
    }
    @PostMapping("/create")
    public String createUser(@Validated @ModelAttribute User user, BindingResult bindingResult,
                             RedirectAttributes redirectAttributes) {

        if(bindingResult.hasFieldErrors()){

            return "createUser";
        }
        this.userService.save(user);
        redirectAttributes.addFlashAttribute("message", "Create blog completely!");

        return "redirect:/";
    }
    @PostMapping("/update")
    public String updateUser(@ModelAttribute User user) {
        this.userService.save(user);

        return "redirect:/";
    }
    @PostMapping("/delete")
    public String deleteUser(@RequestParam Integer id  , @ModelAttribute User user) {

        this.userService.delete(this.userService.findById(id));

        return "redirect:/";
    }

}
