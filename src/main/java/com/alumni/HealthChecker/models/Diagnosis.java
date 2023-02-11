package com.alumni.HealthChecker.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Diagnosis {

    @Id
    @GeneratedValue
    public long id;
    public String name;

    public Diagnosis(){

    }

    public Diagnosis(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    //create diagnosis repository and diagnosis controller. Need to create One to Many for Diagnosis and Many to Many for Symptoms.
}
