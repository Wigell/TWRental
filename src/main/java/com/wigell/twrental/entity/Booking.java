package com.wigell.twrental.entity;


import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.sql.Date;
import com.wigell.twrental.entity.Car;
@Entity
@Table(name = "BOOKING")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "TBL_DATE")
    private Date date;

   // @Column(name = "CUSTOMER")
   // private Customer customer;

   // @Column(name = "CAR")
   // private Car car;

    public Booking() {
    }

    public Booking(long id, Date date) {
        this.id = id;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
