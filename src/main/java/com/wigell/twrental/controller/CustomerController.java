package com.wigell.twrental.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

    @GetMapping("/cars")
    public String cars() {
        return "cars";
    }

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
