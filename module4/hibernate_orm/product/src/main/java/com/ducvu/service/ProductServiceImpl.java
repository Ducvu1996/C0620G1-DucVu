package com.ducvu.service;

import com.ducvu.entity.Product;
import com.ducvu.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired

    private ProductRepository productRepository;
    private static Map<Integer,Product> products;

    @Override
    public List findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public void save(Product product) {
       this.productRepository.save(product);
    }

    @Override
    public Product findById(int id) {
        return this.productRepository.findById(id);
    }

    @Override
    public void update( Product product) {
        this.productRepository.update(product);
    }

    @Override
    public void remove(int id) {
        this.productRepository.remove(id);
    }
}
