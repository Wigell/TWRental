package com.wigell.twrental.service;


import com.wigell.twrental.dao.CustomerRepo;
import com.wigell.twrental.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private CustomerRepo customerRepo;

    public List<Customer> customers() {
        return customerRepo.findAll();
    }
}
