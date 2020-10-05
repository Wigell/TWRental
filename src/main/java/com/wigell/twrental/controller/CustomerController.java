package com.wigell.twrental.controller;


import com.wigell.twrental.entity.Booking;
import com.wigell.twrental.entity.Car;
import com.wigell.twrental.service.BookingService;
import com.wigell.twrental.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.CacheRequest;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

    @Autowired
    private BookingService bookingService;


}
