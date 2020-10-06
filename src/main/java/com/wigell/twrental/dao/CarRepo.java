package com.wigell.twrental.dao;

import com.wigell.twrental.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepo extends JpaRepository<Car, Long> {

    Car findById(long id);
    Car findByName(String name);
    Car findByModel(String model);
    Car findByPrice(double price);


}
