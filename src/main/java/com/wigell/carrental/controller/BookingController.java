package com.wigell.carrental.controller;

import com.wigell.carrental.entity.Booking;
import com.wigell.carrental.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/ordercar")
    public void orderCar(@RequestBody Booking booking) {
        bookingService.orderCar(booking);
    }

    @GetMapping("/myorders")
    public List<Booking> myOrders() {return bookingService.myOrders(); }

    @PutMapping("/updateorder")
    public ResponseEntity<Booking> updateOrder(@RequestBody Booking updatedBooking) { return bookingService.updateOrder(updatedBooking);}
}
