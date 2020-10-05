package com.wigell.twrental.service;

import com.wigell.twrental.dao.CarRepo;
import com.wigell.twrental.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
