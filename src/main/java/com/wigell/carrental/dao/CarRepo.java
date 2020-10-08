package com.wigell.carrental.dao;

import com.wigell.carrental.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepo extends JpaRepository<Car, Long> {

    Car findById(long id);
    Car findByName(String name);
    Car findByModel(String model);
    Car findByPrice(double price);


}
