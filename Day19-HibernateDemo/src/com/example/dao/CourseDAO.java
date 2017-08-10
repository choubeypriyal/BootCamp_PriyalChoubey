package com.example.dao;

import com.example.entity.Course;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CourseDAO {
    public void save(EntityManagerFactory entityManagerFactory) {
        Course course1 = new Course("Arts", 2, 5000.00);
        Course course2 = new Course("Maths", 2, 10000.00);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(course1);
        entityManager.persist(course2);
        transaction.commit();

        entityManager.close();
    }

    public void readById(EntityManagerFactory entityManagerFactory) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Course course = entityManager.find(Course.class, 2);
        System.out.println(course);
    }

    public void update(EntityManagerFactory entityManagerFactory) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        Course course = entityManager.find(Course.class, 2);
        course.setTitle("DOS");
        transaction.commit();

        entityManager.close();
    }

    public void delete(EntityManagerFactory entityManagerFactory) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Course course = entityManager.find(Course.class, 2);
        entityManager.remove(course);
        transaction.commit();

        entityManager.close();
    }

}
