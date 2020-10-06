package com.wigell.twrental.service;

import com.wigell.twrental.dao.BookingRepo;
import com.wigell.twrental.dao.CarRepo;
import com.wigell.twrental.entity.Booking;
import com.wigell.twrental.entity.Car;
import com.wigell.twrental.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static org.hibernate.FetchMode.SELECT;
import static org.hibernate.hql.internal.antlr.SqlTokenTypes.FROM;

@Service
public class BookingService {

    @Autowired
    private BookingRepo bookingRepo;

    @Autowired
    private CarRepo carRepo;

    public List<Booking> cars() {
        return bookingRepo.findAll();
    }

    public Booking orderCar(Booking booking) {

        return bookingRepo.save(booking);
    }



    public List<Booking> myOrders(Customer customer) {
        List<Booking>myorders = bookingRepo.findAll();
        List<Booking>orders = new ArrayList<>();
        
        for (Booking b: myorders) {
            if(b.getCustomer_id() == customer.getId()); {
                orders.add(b);
            }
        }
        return orders;
    }

    public ResponseEntity<Booking> updateOrder(Booking updatedBooking) {
        Booking booking = bookingRepo.findById(updatedBooking.getId());
        booking.setCustomer_id(updatedBooking.getCustomer_id());
        booking.setCar_id(updatedBooking.getCar_id());
        booking.setDate(updatedBooking.getDate());
        final Booking newBooking = bookingRepo.save(booking);
        return ResponseEntity.ok((newBooking));
    }


}
