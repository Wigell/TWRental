package com.wigell.carrental.dao;

import com.wigell.carrental.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Long> {

    Booking findById(long id);
    //Booking findByCustomer_id();
}
