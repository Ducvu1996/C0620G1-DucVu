package DAO;

import model.Category;
import model.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl implements ProductDAO {
    BaseDAO baseDAO = new BaseDAO();
    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement("" +
                    "select product_id,product_name,product_price,product_quantity,product_color,product_description,category_name " +
                    "from product " +
                    "left join category " +
                    "on category.category_id = product.category_id");
            ResultSet resultSet = preparedStatement.executeQuery();
            Product product;
            while (resultSet.next()){
                int product_id = Integer.parseInt(resultSet.getString("product_id"));
                String product_name = resultSet.getString("product_name");
                String product_price = resultSet.getString("product_price");
                int product_quantity = Integer.parseInt(resultSet.getString("product_quantity"));
                String product_color = resultSet.getString("product_color");
                String product_description = resultSet.getString("product_description");
                String product_category = resultSet.getString("category_name");
                product = new Product(product_id,product_name,product_price,product_quantity,product_color,product_description,product_category);
                productList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }

    @Override
    public String save(Product product) {
        try {

            PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement("" +
                    "insert into product(product_name,product_price, product_quantity,product_color,product_description,category_id)" +
                    "values (?,?,?,?,?,?) ");
            preparedStatement.setString(1,product.getProduct_name());
            preparedStatement.setString(2,product.getProduct_price());
            preparedStatement.setInt(3,product.getProduct_quantity());
            preparedStatement.setString(4,product.getProduct_color());
            preparedStatement.setString(5,product.getProduct_description());
            preparedStatement.setInt(6,product.getProduct_category_id());
           preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Product product) {
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement("" +
                    "update product set product_name = ?, product_price= ?, product_quantity = ? ,product_color = ?,category_id =? " +
                    " where product_id = ?");
            preparedStatement.setString(1,product.getProduct_name());
            preparedStatement.setString(2,product.getProduct_price());
            preparedStatement.setInt(3,product.getProduct_quantity());
            preparedStatement.setString(4,product.getProduct_color());
            preparedStatement.setInt(5,product.getProduct_category_id());
            preparedStatement.setInt(6,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void remove(int id) {
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement("" +
                    "delete from product where product_id = ?");
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Product> findByName(String product_name_search) {
        List<Product> productList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement("" +
                    "select product_id,product_name,product_price,product_quantity,product_color,product_description,category_name " +
                    "from product " +
                    "left join category " +
                    "on category.category_id = product.category_id " +
                    "where product_name like ?");
            preparedStatement.setString(1,"%"+product_name_search+"%");
            ResultSet resultSet = preparedStatement.executeQuery();
            Product product;
            while (resultSet.next()){
                int product_id = Integer.parseInt(resultSet.getString("product_id"));
                String product_name = resultSet.getString("product_name");
                String product_price = resultSet.getString("product_price");
                int product_quantity = Integer.parseInt(resultSet.getString("product_quantity"));
                String product_color = resultSet.getString("product_color");
                String product_description = resultSet.getString("product_description");
                String product_category = resultSet.getString("category_name");
                product = new Product(product_id,product_name,product_price,product_quantity,product_color,product_description,product_category);
                productList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }


    @Override
    public List<Category> allCategory() {
        List<Category> categoryList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement("select* from category");
            ResultSet resultSet = preparedStatement.executeQuery();
            Category category;
            while (resultSet.next()){
                int category_id = Integer.parseInt(resultSet.getString("category_id"));
                String category_name = resultSet.getString("category_name");
                category = new Category(category_id,category_name);
                categoryList.add(category);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categoryList;
    }
}
