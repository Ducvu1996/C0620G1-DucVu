package com.bai_tap.controller;

import com.bai_tap.service.Dictionary;
import com.bai_tap.service.DictionaryImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class DictionaryController {
    Dictionary dictionary = new DictionaryImpl();
    @GetMapping("/")
    public String formConvert(){
        return "formDictionary";
    }

    @GetMapping("/translate")
    public String convert(@RequestParam String word, Model model){
        String result =dictionary.findWord(word) ;
        model.addAttribute("result",result);
        return "formDictionary";
    }
}
