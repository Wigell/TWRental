package com.wigell.twrental.dao;

import com.wigell.twrental.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

    Customer findByAddress(String address);
    Customer findById(long id);
    Customer findByName(String name);
    Customer findByPhone(String phone);
}
