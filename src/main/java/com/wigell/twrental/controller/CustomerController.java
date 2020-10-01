package com.wigell.twrental.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

    @GetMapping("/cars")
    public String getCars() {
        return "Tillgängliga bilar";
    }

    @GetMapping("/ordercar")
    public String orderCar(){
        return "Beställa hyrbil";
    }

    @GetMapping("/updateorder")
    public String updateOrder() {
        return "Avboka bil";
    }

    @GetMapping("/myorders")
    public String myOrders() {
        return "Aktiva bokningar";
    }
}
