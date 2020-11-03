package com.codegym.blog.controller;

import com.codegym.blog.entity.Blog;
import com.codegym.blog.entity.Category;
import com.codegym.blog.service.BlogService;
import com.codegym.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/blogRest")
public class BlogRestController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private CategoryService categoryService;
    @RequestMapping(value = "/list")
    private ResponseEntity<List<Blog>> getListBlog(){
        return new ResponseEntity<>(blogService.findAll(), HttpStatus.OK);
    }
    @RequestMapping(value = "/listCategory")
    private ResponseEntity<List<Category>> getListCategory(){
        return new ResponseEntity<>(categoryService.findAll(), HttpStatus.OK);
    }
    @RequestMapping(value = "/detail/{id}")
    private ResponseEntity<Blog> getBlog(@PathVariable int id){
        return new ResponseEntity<>(blogService.findById(id), HttpStatus.OK);
    }
    @RequestMapping(value = "/listByCategory/{id}")
    private ResponseEntity<List<Blog>> getBlogByCategory(@PathVariable int id){
        return new ResponseEntity<>(blogService.findBlogByCategory(id), HttpStatus.OK);
    }

}
