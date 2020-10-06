package com.wigell.twrental.controller;


import com.wigell.twrental.dao.BookingRepo;
import com.wigell.twrental.entity.Booking;
import com.wigell.twrental.entity.Car;
import com.wigell.twrental.entity.Customer;
import com.wigell.twrental.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @Autowired
    private BookingRepo bookingRepo;

    @PostMapping("/ordercar")
    public void orderCar(@RequestBody Booking booking) {
        bookingService.orderCar(booking);
    }

    @GetMapping("/myorders")
    public List<Booking> myOrders(@RequestBody Customer customer) {return bookingService.myOrders(); }

    @PutMapping("/updateorder")
    public ResponseEntity<Booking> updateOrder(@RequestBody Booking updatedBooking) { return bookingService.updateOrder(updatedBooking);}
}
