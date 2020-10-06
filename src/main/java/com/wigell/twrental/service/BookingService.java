package com.wigell.twrental.service;

import com.wigell.twrental.dao.BookingRepo;
import com.wigell.twrental.dao.CarRepo;
import com.wigell.twrental.entity.Booking;
import com.wigell.twrental.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
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


    //Förutsätter att den inloggade användaren i det här fallet har id 1
    //och visar bokningarna för denna användare
    public List<Booking> myOrders() {
        List<Booking>myorders = new ArrayList<>();
        List<Booking>orders = new ArrayList<>();
        myorders = bookingRepo.findAll();

        for (Booking b: myorders) {

            if(b.getCustomer_id()==1) {
                orders.add(b);
            }
        }
        return orders;
    }
}
