package com.ducvu.repository;

import com.ducvu.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,String> {
//    List<Book> findAllByStatus

}
