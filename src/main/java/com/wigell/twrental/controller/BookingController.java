package com.wigell.twrental.controller;


import com.wigell.twrental.dao.BookingRepo;
import com.wigell.twrental.entity.Booking;
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
   public List<Booking> myOrders() {return bookingService.myOrders();
    }
        

    @PutMapping("/updateorder/{id}")
    public ResponseEntity<Booking> updateOrder(@PathVariable(value = "id")Long id, @RequestBody Booking updatedBooking)
    throws ResourceNotFoundException {

        Booking booking = bookingRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Booking not found for this id: " + id));
        booking.setCustomer_id(updatedBooking.getCustomer_id());
        booking.setCar_id(updatedBooking.getCar_id());
        booking.setDate(updatedBooking.getDate());
        final Booking newBooking = bookingRepo.save(booking);
        return ResponseEntity.ok((newBooking));
    }
}
