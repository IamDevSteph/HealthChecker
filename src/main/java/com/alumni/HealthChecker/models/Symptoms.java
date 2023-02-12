package com.alumni.HealthChecker.models;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Symptoms {

    @Id
    @GeneratedValue
    public Long id;
    public String name;
    public String description;
    @ManyToOne
    public Diagnosis diagnosis;

    public Symptoms(){

    }

    public Symptoms(Long id, String name, String description, Diagnosis diagnosis){
        this.id = id;
        this.name = name;
        this.description = description;
        this.diagnosis = diagnosis;
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
