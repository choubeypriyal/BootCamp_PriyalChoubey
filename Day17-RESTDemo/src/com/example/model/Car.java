package com.example.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Car {
    public Car() {
    }

    int vin;
    String name;
    String make;
    transient double price;
    int qty;

    public Car(int vin, String name, String make, double price, int qty) {
        this.vin = vin;
        this.name = name;
        this.make = make;
        this.price = price;
        this.qty = qty;
    }


    @Override
    public String toString() {
        return "Car{" +
                "vin=" + vin +
                ", name='" + name + '\'' +
                ", make='" + make + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    @XmlTransient
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
