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
    static {
        products = new HashMap<>();
        products.put(1, new Product(1,"iphone 3",300.0,"USA"));
        products.put(2, new Product(2,"iphone 4",400.0,"USA"));
        products.put(3, new Product(3,"iphone 5",500.0,"USA"));
        products.put(4, new Product(4,"iphone 7",600.0,"USA"));
        products.put(5, new Product(5,"iphone 8",700.0,"USA"));
        products.put(6, new Product(6,"iphone X",800.0,"USA"));
        products.put(7, new Product(7,"iphone 11",800.0,"USA"));
    }
    @Override
    public List findAll() {
        return new ArrayList(this.products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getProduct_id(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
