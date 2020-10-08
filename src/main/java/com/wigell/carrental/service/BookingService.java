package com.wigell.carrental.service;

import com.wigell.carrental.dao.BookingRepo;
import com.wigell.carrental.entity.Booking;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepo bookingRepo;

    private static final Logger logger = LoggerFactory.logger(BookingService.class);

    public Booking orderCar(Booking booking) {
        logger.info("New booking. Id " + booking.getId() );
        return bookingRepo.save(booking);
    }

    public List<Booking> myOrders() {
        return bookingRepo.findAll();
    }

    public ResponseEntity<Booking> updateOrder(Booking updatedBooking) {
        Booking booking = bookingRepo.findById(updatedBooking.getId());
        booking.setCustomer_id(updatedBooking.getCustomer_id());
        booking.setCar_id(updatedBooking.getCar_id());
        booking.setDate(updatedBooking.getDate());
        final Booking newBooking = bookingRepo.save(booking);
        logger.info("Booking " + booking.getId() + " updated");
        return ResponseEntity.ok((newBooking));
    }
}
