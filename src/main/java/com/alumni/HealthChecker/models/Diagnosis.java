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
    
}
