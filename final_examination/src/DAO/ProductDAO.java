package DAO;

import model.Category;
import model.Product;

import java.util.List;

public interface ProductDAO {
    List<Product> findAll();
    String save(Product product);
    Product findById(int id);
    void update(int id, Product product);
    void remove(int id);
    List<Product> findByName(String product_name);
    List<Category> allCategory();
}
