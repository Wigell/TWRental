package com.wigell.carrental.service;

import com.wigell.carrental.dao.CustomerRepo;
import com.wigell.carrental.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public List<Customer> customers() {
        return customerRepo.findAll();
    }


}

