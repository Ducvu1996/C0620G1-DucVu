package com.bai_tap.controller;

import com.bai_tap.entity.MailBox;
import com.bai_tap.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping({"","/mail"})
public class MailController {
    @Autowired
    private MailService mailService;
    @RequestMapping(method = RequestMethod.GET)
    public String goListMail(Model model){
        model.addAttribute("listMail",mailService.findAll());
        return "list_mail";
    }
    @RequestMapping("/update/{id}")

    public String formUpdate(@PathVariable int id,Model model){
        model.addAttribute("mail",mailService.findById(id));
        return "form_edit";
    }
    @PostMapping("/create")
    public String update(@ModelAttribute MailBox mailBox, RedirectAttributes redirectAttributes){
        this.mailService.update(mailBox.getId(),mailBox);
        redirectAttributes.addFlashAttribute("message", "update mail OK!");

        return "redirect:/mail";
    }
}
