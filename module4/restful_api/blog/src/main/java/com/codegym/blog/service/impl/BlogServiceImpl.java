package com.codegym.blog.service.impl;

import com.codegym.blog.entity.Blog;
import com.codegym.blog.entity.Category;
import com.codegym.blog.repository.BlogRepository;
import com.codegym.blog.repository.CategoryRepository;
import com.codegym.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;
    private CategoryRepository blogCategoryRepository;


    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return this.blogRepository.findAll(pageable);
    }

    @Override
    public List<Blog> findAll() {
        return this.blogRepository.findAll();
    }


    @Override
    public Blog findById(Integer id) {
        return this.blogRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Blog blog) {
        this.blogRepository.save(blog);
    }

    @Override
    public void delete(Blog blog) {
        this.blogRepository.delete(blog);
    }

    @Override
    public Page<Blog> findAllByNameContaining(Pageable pageable, String name) {
        return this.blogRepository.findAllByNameContaining(pageable,name);
    }

    @Override
    public List<Blog> findBlogByCategory(int id) {
        return this.blogRepository.findBlogByCategory(id);
    }
}
