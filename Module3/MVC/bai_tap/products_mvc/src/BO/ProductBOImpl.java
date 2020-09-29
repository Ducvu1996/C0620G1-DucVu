package BO;

import DAO.ProductDAO;
import DAO.ProductDAOImpl;
import model.Product;

import java.util.List;

public class ProductBOImpl implements ProductBO {
    ProductDAO productDAO = new ProductDAOImpl();

    @Override
    public List<Product> findAll() {
        return this.productDAO.findAll();
    }

    @Override
    public String save(Product product) {
        String message = "";
        if (product.getNameProduct() == null || product.getNameProduct().equals("")) {
            message = "Please input name";
        } else {
            message = productDAO.save(product);
        }

        return message;
    }

    @Override
    public Product findById(int id) {
        return this.productDAO.findById(id);
    }

    @Override
    public void update(int id, Product product) {
        this.productDAO.update( id, product);
    }

    @Override
    public void remove(int id) {
        this.productDAO.remove(id);
    }

    @Override
    public List<Product> findByName(String nameProduct) {
        return this.productDAO.findByName(nameProduct );
    }

}
