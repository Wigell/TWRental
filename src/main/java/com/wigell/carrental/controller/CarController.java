package com.wigell.carrental.controller;

import com.wigell.carrental.entity.Car;
import com.wigell.carrental.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @PutMapping("/updatecar")
    public ResponseEntity<Car> updateCar(@RequestBody Car car) { return carService.updateCar(car); }

    @DeleteMapping("/deletecar")
    public void deleteCar(@RequestBody Car car){ carService.deleteCar(car);}
}
