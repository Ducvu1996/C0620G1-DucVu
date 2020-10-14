package BO;

import DAO.ProductDAO;
import DAO.ProductDAOImpl;
import model.Category;
import model.Product;

import java.util.List;

public class ProductBOImpl implements ProductBO{
    ProductDAO productDAO = new ProductDAOImpl();
    @Override
    public List<Product> findAll() {
        return this.productDAO.findAll();
    }

    @Override
    public List<Category> allCategory() {
        return this.productDAO.allCategory();
    }

    @Override
    public String save(Product product) {
        return this.productDAO.save(product);
    }

    @Override
    public Product findById(int id) {
        return this.productDAO.findById(id);
    }

    @Override
    public void update(int id, Product product) {
        this.productDAO.update(id,product);
    }

    @Override
    public void remove(int id) {
        this.productDAO.remove(id);
    }

    @Override
    public List<Product> findByName(String product_name) {
        return this.productDAO.findByName(product_name);
    }

}
