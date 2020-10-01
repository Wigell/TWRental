package com.wigell.twrental.dao;

import com.wigell.twrental.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepo extends JpaRepository<Customer, Long> {

    Customer findByName(String name);
    Customer findById(long id);
    Customer findByAddress(String address);
}
