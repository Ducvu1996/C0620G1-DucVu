package com.ducvu.service.impl;

import com.ducvu.entity.Book;
import com.ducvu.repository.BookRepository;
import com.ducvu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;
    @Override
    public List<Book> findAll() {
        return this.bookRepository.findAll();
    }

    @Override
    public Optional<Book> findByCode(String code) {
        return null;
    }
}
