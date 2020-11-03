package com.ducvu.controller;

import com.ducvu.entity.Customer;
import com.ducvu.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customerRest")
public class CustomerRestController {
    @Autowired
    private CustomerService customerService;
    @RequestMapping(value = "/list")
    private ResponseEntity<List<Customer>> getListCustomer(){
        return new ResponseEntity<>(customerService.findAll(), HttpStatus.OK);
    }
}
