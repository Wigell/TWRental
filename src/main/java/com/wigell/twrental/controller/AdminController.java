package com.wigell.twrental.controller;


import com.wigell.twrental.entity.Customer;
import com.wigell.twrental.service.CarService;
import com.wigell.twrental.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AdminController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CarService carService;

    @GetMapping("/customers")
    public List<Customer>customers() {
        return customerService.customers();
    }

    @GetMapping("/addcar")
    public String addCar() {
        return "Lägg till bil";
    }

    @GetMapping("/deletecar")
    public String deleteCar() {
        return "Ta bort bil";
    }

    @GetMapping("/updatecar")
    public String updateCar() {
        return "Uppdatera bil";
    }
}
