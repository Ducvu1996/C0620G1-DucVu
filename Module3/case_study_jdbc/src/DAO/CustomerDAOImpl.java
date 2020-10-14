package DAO;

import model.Customer;
import model.CustomerType;


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
                    "select customer_id,customer_name,customer_birthday,customer_gender,customer_address,customer.customer_type_id,customer_type.customer_type_name " +
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
                int customer_type_id= Integer.parseInt(resultSet.getString("customer_type_id"));
                String customer_type_name= resultSet.getString("customer_type.customer_type_name");
                customer = new Customer(customer_id,customer_name,customer_birthday,customer_gender,customer_address,customer_type_id,customer_type_name );
                customerList.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public String save(Customer customer) {
        String message = "";
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
            preparedStatement.setInt(8,customer.getCustomer_type_id());
            preparedStatement.executeUpdate();
            message = "created customer completely";
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return message;
    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Customer customer) {
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement("" +
                    "update customer set customer_name = ?, customer_birthday = ? ,customer_address = ?,customer_type_id =? " +
                    "where customer_id = ?");
            preparedStatement.setString(1,customer.getCustomer_name());
            preparedStatement.setString(2,customer.getCustomer_birthday());
            preparedStatement.setString(3,customer.getCustomer_address());
            preparedStatement.setInt(4,customer.getCustomer_type_id());
            preparedStatement.setInt(5,id);
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

    @Override
    public List<CustomerType> allCustomerType() {
        List<CustomerType> customerTypeList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement("select *from customer_type");
            ResultSet resultSet = preparedStatement.executeQuery();
            CustomerType customerType;
            while (resultSet.next()){
                int customer_type_id = Integer.parseInt(resultSet.getString("customer_type_id"));
                String customer_type_name = resultSet.getString("customer_type_name");
                customerType = new CustomerType(customer_type_id,customer_type_name);
                customerTypeList.add(customerType);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return customerTypeList;
    }
}
