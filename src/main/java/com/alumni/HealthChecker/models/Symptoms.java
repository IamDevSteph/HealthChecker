package com.alumni.HealthChecker.models;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Symptoms {

    @Id
    @GeneratedValue
    public Long id;
    public String name;
    public String description;

    public Symptoms(){

    }

    public Symptoms(Long id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
}
