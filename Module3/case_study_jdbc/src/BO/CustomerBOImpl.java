package BO;

import DAO.CustomerDAO;
import DAO.CustomerDAOImpl;
import model.Customer;

import java.util.List;

public class CustomerBOImpl implements CustomerBO {
    CustomerDAO customerDAO = new CustomerDAOImpl();
    @Override
    public List<Customer> findAll() {
        return this.customerDAO.findAll();
    }

    @Override
    public String save(Customer customer) {
        return this.customerDAO.save(customer);
    }

    @Override
    public Customer findById(int id) {
        return this.customerDAO.findById(id);
    }

    @Override
    public void update(int id, Customer customer) {
        this.customerDAO.update(id,customer);
    }

    @Override
    public void remove(int id) {
        this.customerDAO.remove(id);
    }

    @Override
    public List<Customer> findByName(String customer_name) {
        return null;
    }
}
