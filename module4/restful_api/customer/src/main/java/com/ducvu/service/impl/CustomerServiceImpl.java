package com.ducvu.service.impl;

import com.ducvu.entity.Customer;
import com.ducvu.repository.CustomerRepository;
import com.ducvu.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<Customer> findAll() {
        return this.customerRepository.findAll();
    }

    @Override
    public Customer findById(Integer id) throws Exception {
        return null;
    }

    @Override
    public void save(Customer customer) {

    }
}
