package com.PHC.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @Column(name="name")
    private String name;
    @Column(name="location")
    private String location;
    @Column(name="phone")
    private String phone;
    @Column(name="experience")
    private String experience;
    @Column(name="salary")
    private String salary;
    @Column(name="domain")
    private String domain;

    @ManyToOne
    @JoinColumn(name = "hospital_id",referencedColumnName = "id",nullable = false)
    private Hospital hospital;

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", phone='" + phone + '\'' +
                ", experience='" + experience + '\'' +
                ", salary='" + salary + '\'' +
                ", domain='" + domain + '\'' +
                ", hospital=" + hospital +
                '}';
    }

    public Employee() {
    }

    public Employee(String name, String location, String experience, String phone, String salary, String domain, Hospital hospital) {
        this.name = name;
        this.location = location;
        this.experience = experience;
        this.phone = phone;
        this.salary = salary;
        this.domain = domain;
        this.hospital = hospital;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Employee(int id, String name, String location, String phone, String experience, String salary, String domain, Hospital hospital) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.phone = phone;
        this.experience = experience;
        this.salary = salary;
        this.domain = domain;
        this.hospital = hospital;
    }
}
