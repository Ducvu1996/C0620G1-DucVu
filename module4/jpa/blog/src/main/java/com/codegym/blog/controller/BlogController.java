package com.codegym.blog.controller;

import com.codegym.blog.entity.Blog;
import com.codegym.blog.service.BlogService;
import com.codegym.blog.service.CategoryService;
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
@RequestMapping({"/blog", ""})
public class BlogController {
    @Autowired
    private BlogService blogService;

    @Autowired
    private CategoryService categoryService;


    @RequestMapping(method = RequestMethod.GET)
    public String listBlog( Model model, @PageableDefault(size =2) Pageable pageable,
                           @RequestParam Optional<String> keyword){
        String keywordOld = "";
        if (keyword.isPresent()) {
            keywordOld = keyword.get();

           model.addAttribute("listBlog", blogService.findAllByNameContaining(pageable, keywordOld));
        } else {
            model.addAttribute("listBlog", blogService.findAll(pageable));
        }
        model.addAttribute("keywordOld", keywordOld);

        model.addAttribute("blog", new Blog());
        model.addAttribute("categoryList",this.categoryService.findAll());
        return "list_blog";
    }
    @PostMapping("/create")
    public String createBlog(@Validated @ModelAttribute Blog blog, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if(bindingResult.hasFieldErrors()){
            return "list_blog";
        }
        this.blogService.save(blog);
        redirectAttributes.addFlashAttribute("message", "Create blog completely!");

        return "redirect:/";
    }
    @PostMapping("/update")
    public String updateBlog(@ModelAttribute Blog blog) {
        this.blogService.save(blog);

        return "redirect:/";
    }
    @PostMapping("/delete")
    public String deleteBlog(@RequestParam Integer id  , @ModelAttribute Blog blog) {

        this.blogService.delete(this.blogService.findById(id));

        return "redirect:/";
    }

}
