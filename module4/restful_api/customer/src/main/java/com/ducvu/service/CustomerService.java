package com.ducvu.service;

import com.ducvu.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer findById(Integer id) throws Exception;

     void save(Customer customer);

}
