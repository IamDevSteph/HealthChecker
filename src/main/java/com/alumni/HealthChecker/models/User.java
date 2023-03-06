package com.alumni.HealthChecker.models;
import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

    //id (int/PRIMARY KEY), name(String/TEXT), age(int) ???
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;
    public int age;

    public User(){

    }

    public User(Long id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
