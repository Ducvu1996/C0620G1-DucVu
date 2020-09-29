package BO;

import model.Product;

import java.util.List;

public interface ProductBO {
    List<Product> findAll();
    String save(Product product);
    Product findById(int id);
    void update(int id, Product product);
    void remove(int id);
    List<Product> findByName(String nameProduct);
}
