package com.wigell.carrental.dao;

import com.wigell.carrental.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

    Customer findByAddress(String address);
    Customer findById(long id);
    Customer findByName(String name);
    Customer findByPhone(String phone);
}
