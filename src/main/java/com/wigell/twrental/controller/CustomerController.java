package com.wigell.twrental.controller;


import com.wigell.twrental.entity.Car;
import com.wigell.twrental.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.CacheRequest;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {



    @GetMapping("/ordercar")
    public String orderCar() {
        return "OrderCar";
    }

    @GetMapping("/updateorder")
    public String updateOrder() {
        return "updateOrder";
    }

    @GetMapping("/myorders")
    public String myOrders() {
        return "myOrders";
    }
}
