package DAO;

import model.Customer;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {
    BaseDAO baseDAO = new BaseDAO();
    @Override
    public List<Customer> findAll() {
        List<Customer> customerList =new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement(
                    "select customer_id,customer_name,customer_birthday,customer_gender,customer_address,customer_type_name" +
                    " from customer " +
                    "left join customer_type on customer.customer_type_id = customer_type.customer_type_id ");
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer;
            while (resultSet.next()){
                Integer customer_id = Integer.valueOf(resultSet.getString("customer_id"));
                String customer_name= resultSet.getString("customer_name");
                String customer_birthday= resultSet.getString("customer_birthday");
                String customer_gender= resultSet.getString("customer_gender");
                String customer_address= resultSet.getString("customer_address");
                String customer_type= resultSet.getString("customer_type_name");
                customer = new Customer(customer_id,customer_name,customer_birthday,customer_gender,customer_address,customer_type);
                customerList.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public String save(Customer customer) {
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement("" +
                    "insert into customer(customer_name,customer_birthday,customer_gender,customer_id_card," +
                    "customer_phone,customer_email,customer_address,customer_type_id) " +
                    "values (?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1,customer.getCustomer_name());
            preparedStatement.setString(2,customer.getCustomer_birthday());
            preparedStatement.setInt(3,Integer.parseInt(customer.getCustomer_gender()));
            preparedStatement.setString(4,customer.getCustomer_id_card());
            preparedStatement.setString(5,customer.getCustomer_phone());
            preparedStatement.setString(6,customer.getCustomer_email());
            preparedStatement.setString(7,customer.getCustomer_address());
            preparedStatement.setInt(8,Integer.parseInt(customer.getCustomer_type()));
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Customer customer) {
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement("" +
                    "update customer set customer_name = ?, customer_birthday = ? ,customer_address = ? " +
                    "where customer_id = ?");
            preparedStatement.setString(1,customer.getCustomer_name());
            preparedStatement.setString(2,customer.getCustomer_birthday());
            preparedStatement.setString(3,customer.getCustomer_address());
            preparedStatement.setInt(4,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void remove(int id) {
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement("" +
                    "delete from customer where customer_id = ?");
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Customer> findByName(String customer_name) {
        return null;
    }
}
