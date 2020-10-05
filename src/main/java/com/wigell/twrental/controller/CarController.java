package com.wigell.twrental.controller;

import com.wigell.twrental.entity.Car;
import com.wigell.twrental.service.CarService;
import com.wigell.twrental.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public List<Car> cars() {
        return carService.cars();
    }

    @PostMapping("/addcar")
    public Car addCar(@RequestBody Car car){
        return  carService.addcar(car);
    }
}
