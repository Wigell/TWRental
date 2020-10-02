package com.wigell.twrental.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AdminController {

    @GetMapping("/customers")
    public String customers() {
        return "Lista på customers";
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
