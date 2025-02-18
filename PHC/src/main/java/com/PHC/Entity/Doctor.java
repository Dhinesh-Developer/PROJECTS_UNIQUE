package com.PHC.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name",nullable = false)
    private String name;
    @Column(name="domain",nullable = false)
    private String domain;
    @Column(name="experience",nullable = false)
    private int experience;
    @ManyToOne
    @JoinColumn(name = "hospital_id", referencedColumnName = "id", nullable = false)
    private Hospital hospital;

    @Column(name="address",nullable = false)
    private String address;
    @Column(name="phone_number",nullable = false)
    private String phoneNumber;
    @Column(name="degree",nullable = false)
    private String degree;
    @Column(name="certified",nullable = false)
    private String certified;

    public Doctor(int id, String name, String domain, int experience, Hospital hospital, String address, String phoneNumber, String degree, String certified) {
        this.id = id;
        this.name = name;
        this.domain = domain;
        this.experience = experience;
        this.hospital = hospital;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.degree = degree;
        this.certified = certified;
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

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getCertified() {
        return certified;
    }

    public void setCertified(String certified) {
        this.certified = certified;
    }

    public Doctor(String name, String domain, int experience, Hospital hospital, String address, String phoneNumber, String degree, String certified) {
        this.name = name;
        this.domain = domain;
        this.experience = experience;
        this.hospital = hospital;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.degree = degree;
        this.certified = certified;
    }

    public Doctor() {
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", domain='" + domain + '\'' +
                ", experience=" + experience +
                ", hospital=" + hospital +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", degree='" + degree + '\'' +
                ", certified='" + certified + '\'' +
                '}';
    }
}
