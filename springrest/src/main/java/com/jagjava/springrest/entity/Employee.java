package com.jagjava.springrest.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstName;
    private  String lastName;
    private String email;
    private String phone;
    private String department;
    private String designation;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String dateOfBirth;
}
