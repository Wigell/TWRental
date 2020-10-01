package com.wigell.twrental.dao;


import com.wigell.twrental.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarRepo extends JpaRepository<Car, Long> {
}
