package com.wigell.twrental.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AdminController {

    @GetMapping("/customers")
    public String getCustomers() {
        return "Lista på alla kunder";
    }

    @GetMapping("/addcar")
    public String addCar() {
        return "Lägga till fordon";
    }

    @GetMapping("/deletecar")
    public String deleteCar() {
        return "Fordon raderat";
    }

    @GetMapping("/updatecar")
    public String updateCar() {
        return "Fordon uppdaterad";
    }
}
