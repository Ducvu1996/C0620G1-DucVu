package DAO;

import model.Customer;
import model.CustomerType;

import java.util.List;

public interface CustomerDAO {
    List<Customer> findAll();
    String save(Customer customer);
    Customer findById(int id);
    void update(int id, Customer customer);
    void remove(int id);
    List<Customer> findByName(String customer_name);

    List<CustomerType> allCustomerType();
}
