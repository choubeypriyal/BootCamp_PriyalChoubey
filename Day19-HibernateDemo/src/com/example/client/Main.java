package com.example.client;

import com.example.dao.CourseDAO;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("mysql");
        CourseDAO courseDAO = new CourseDAO();
        //courseDAO.save(managerFactory);
        courseDAO.readById(managerFactory);
        courseDAO.update(managerFactory);
        courseDAO.delete(managerFactory);
        managerFactory.close();
    }
}
