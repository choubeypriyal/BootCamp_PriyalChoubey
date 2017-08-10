package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "course_details")

public class Course {

    @Column(length = 20, nullable = false)
    String title;

    @Id
    @Column(name = "column_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    int duration;

    @Column
    double price;

    public Course(String title, int id, int duration, double price) {
        this.title = title;
        this.id = id;
        this.duration = duration;
        this.price = price;
    }

    public Course(String title, int duration, double price) {
        this.title = title;
        this.duration = duration;
        this.price = price;
    }

    public Course() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", id=" + id +
                ", duration=" + duration +
                ", price=" + price +
                '}';
    }
}
