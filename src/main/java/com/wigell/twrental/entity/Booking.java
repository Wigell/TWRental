package com.wigell.twrental.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "BOOKING")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "DATE")
    private Date date;

    @Column(name = "CUSTOMER_ID")
    private long customer_id;

    @Column(name = "CAR_ID")
    private long car_id;

    public Booking() {
    }

    public Booking(Date date, long customer_id, long car_id) {
        this.date = date;
        this.customer_id = customer_id;
        this.car_id = car_id;
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

    public long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(long customer_id) {
        this.customer_id = customer_id;
    }

    public long getCar_id() {
        return car_id;
    }

    public void setCar_id(long car_id) {
        this.car_id = car_id;
    }
}
