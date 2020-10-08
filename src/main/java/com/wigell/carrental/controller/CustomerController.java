package com.wigell.carrental.controller;

import com.wigell.carrental.entity.Customer;
import com.wigell.carrental.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer>customers() {
        return customerService.customers();
    }

}
