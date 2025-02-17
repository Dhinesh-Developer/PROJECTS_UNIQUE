package com.PHC.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Hospital")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name",nullable = false)
    private String name;
    @Column(name="place",nullable = false)
    private String place;
    @Column(name="location",nullable = false)
    private String location;

    public Hospital(int id, String name, String place, String location) {
        this.id = id;
        this.name = name;
        this.place = place;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public Hospital() {
    }

    public Hospital(String name, String place, String location) {
        this.name = name;
        this.place = place;
        this.location = location;
    }
}
