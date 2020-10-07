package com.wigell.twrental.dao;

import com.wigell.twrental.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Long> {

    Booking findById(long id);
    //Booking findByCustomer_id();
}
