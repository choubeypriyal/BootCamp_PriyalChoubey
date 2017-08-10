package com.example.dao;

import com.example.model.Car;
import org.springframework.stereotype.Repository;

@Repository
public class CarDAO {
    public Car selectByVin(int vin){
        //JDBC logic
        return new Car(100,"Audi","bleh",780000.00,10);
    }
}
