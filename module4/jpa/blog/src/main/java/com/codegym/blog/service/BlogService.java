package com.codegym.blog.service;

import com.codegym.blog.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);

    Blog findById(Integer id);

    void save(Blog blog);
    void delete(Blog blog);

    Page<Blog> findAllByNameContaining(Pageable pageable, String name);
}