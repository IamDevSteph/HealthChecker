package com.alumni.HealthChecker.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.List;

@Entity
public class Diagnosis {

    @Id
    @GeneratedValue
    public long id;
    public String name;
    @OneToMany(mappedBy = "diagnosis")
    @JsonIgnore
    public Collection<Symptoms> symptoms;

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
    public Collection<Symptoms> getSymptoms(){ return symptoms; }
    //create diagnosis repository and diagnosis controller. Need to create One to Many for Diagnosis and Many to Many for Symptoms.
}
