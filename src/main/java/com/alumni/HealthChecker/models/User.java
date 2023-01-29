package com.alumni.HealthChecker.models;

import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;

public class User {
    @Id
    @GeneratedValue

    private Long id;

    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String phone;
    private String profilePicture;
    private String password;
    private String country;
    private String state;
    private String county;
    private String city;
    private String address1;
    private String address2;
    private String zipCode;





}
