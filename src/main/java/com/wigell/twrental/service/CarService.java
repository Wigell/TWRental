package com.wigell.twrental.service;

import com.wigell.twrental.dao.CarRepo;
import com.wigell.twrental.entity.Booking;
import com.wigell.twrental.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepo carRepo;

    public List<Car> cars() {
        return carRepo.findAll();
    }

    public Car addcar(Car car){
        return carRepo.save(car);
    }


    public ResponseEntity<Car> updateCar( Car updatedCar, long id) {
            Car car = carRepo.findById(id);
            car.setName(updatedCar.getName());
            car.setModel(updatedCar.getModel());
            car.setPrice(updatedCar.getPrice());
            final Car newCar = carRepo.save(car);
            return ResponseEntity.ok((newCar));

    }



}
