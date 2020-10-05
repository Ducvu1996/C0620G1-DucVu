package BO;



import model.Customer;

import java.util.List;

public interface CustomerBO {
    List<Customer> findAll();
    String save(Customer customer);
    Customer findById(int id);
    void update(int id, Customer customer);
    void remove(int id);
    List<Customer> findByName(String customer_name);
}
