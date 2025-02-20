package com.PHC.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name",nullable = false)
    private String name;
    @Column(name="age",nullable = false)
    private int age;
    @Column(name="gender",nullable = false)
    private String gender;
    @Column(name="blood",nullable = false)
    private String blood;
    @Column(name="conditions",nullable = false)
    private String conditions;
    @Column(name="surgeries",nullable = false)
    private String surgeries;
    @Column(name="emergencycontact",nullable = false)
    private String emergencycontact;
    @Column(name="email",nullable = false,unique = true)
    private String email;
    @Column(name="emailrelation",nullable = false,unique = true)
    private String emailrelation;
    @ManyToOne
    @JoinColumn(name = "hospital_id",referencedColumnName = "id")
    private Hospital hospital;
    @Column(name="location",nullable = false)
    private String location;

    public Hospital getHosital() {
        return hospital;
    }

    public void setHosital(Hospital hosital) {
        this.hospital = hosital;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", blood='" + blood + '\'' +
                ", conditions='" + conditions + '\'' +
                ", surgeries='" + surgeries + '\'' +
                ", emergencycontact='" + emergencycontact + '\'' +
                ", email='" + email + '\'' +
                ", emailrelation='" + emailrelation + '\'' +
                ", hosital=" + hospital +
                ", location='" + location + '\'' +
                '}';
    }

    public Patient(int id, String name, int age, String gender, String blood, String conditions, String surgeries, String emergencycontact, String email, String emailrelation, Hospital hosital, String location) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.blood = blood;
        this.conditions = conditions;
        this.surgeries = surgeries;
        this.emergencycontact = emergencycontact;
        this.email = email;
        this.emailrelation = emailrelation;
        this.hospital = hosital;
        this.location = location;
    }

    public Patient() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getSurgeries() {
        return surgeries;
    }

    public void setSurgeries(String surgeries) {
        this.surgeries = surgeries;
    }

    public String getEmergencycontact() {
        return emergencycontact;
    }

    public void setEmergencycontact(String emergencycontact) {
        this.emergencycontact = emergencycontact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailrelation() {
        return emailrelation;
    }

    public void setEmailrelation(String emailrelation) {
        this.emailrelation = emailrelation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Patient(int age, String name, String gender, String blood, String conditions, String surgeries, String emergencycontact, String email, String emailrelation, Hospital hosital, String location) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.blood = blood;
        this.conditions = conditions;
        this.surgeries = surgeries;
        this.emergencycontact = emergencycontact;
        this.email = email;
        this.emailrelation = emailrelation;
        this.hospital = hosital;
        this.location = location;
    }
}