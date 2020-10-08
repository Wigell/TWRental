package com.wigell.carrental.service;

import com.wigell.carrental.dao.CarRepo;
import com.wigell.carrental.entity.Car;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepo carRepo;

    private static final Logger logger = LoggerFactory.logger(CarService.class);

    public List<Car> cars() {
        return carRepo.findAll();
    }

    public Car addcar(Car car){
        logger.info(car.getName() + " " + car.getModel() + " added");
        return carRepo.save(car);
    }

    public ResponseEntity<Car> updateCar( Car updatedCar) {
        Car car = carRepo.findById(updatedCar.getId());
        car.setName(updatedCar.getName());
        car.setModel(updatedCar.getModel());
        car.setPrice(updatedCar.getPrice());
        final Car newCar = carRepo.save(car);
        logger.info("Car " + car.getId() + " updated");
        return ResponseEntity.ok((newCar));
    }

    public void deleteCar(Car car) {
        carRepo.delete(car);
        logger.info("Car " + car.getId() + " deleted");
     }
}
