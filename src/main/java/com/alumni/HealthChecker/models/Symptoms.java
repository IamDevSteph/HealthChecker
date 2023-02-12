package com.alumni.HealthChecker.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Symptoms {

    @Id
    @GeneratedValue
    public Long id;
    public String symptomsName;
    public String description;
    @ManyToOne
    public Diagnosis diagnosis;

    public Symptoms(){

    }

    public Symptoms(Long id, String symptomsName, String description, Diagnosis diagnosis){
        this.id = id;
        this.symptomsName = symptomsName;
        this.description = description;
        this.diagnosis = diagnosis;
    }

    public Long getId(){
        return id;
    }
    public String getSymptomsName(){
        return symptomsName;
    }
    public String getDescription(){
        return description;
    }
}
