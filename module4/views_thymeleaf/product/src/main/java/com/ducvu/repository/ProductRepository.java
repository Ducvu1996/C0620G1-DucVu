package com.ducvu.repository;

import com.ducvu.entity.Product;


import java.util.List;

public interface ProductRepository {

    List<Product> findAll();

    Product findById(Integer id);

    void save(Product student);
}
