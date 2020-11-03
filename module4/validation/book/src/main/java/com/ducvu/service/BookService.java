package com.ducvu.service;

import com.ducvu.entity.Book;

import java.util.List;
import java.util.Optional;


public interface BookService {
    List<Book> findAll();
    Optional<Book> findByCode(String code);
}
