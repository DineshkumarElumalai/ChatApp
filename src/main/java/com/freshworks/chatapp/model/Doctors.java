package com.freshworks.chatapp.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name = "doctors")
public class Doctors {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "email")
    @Email(message = "*Please provide a valid Email")
    private String email;
    @Column(name = "name")
    private String name;
    @Column(name = "category")
    private String Category;

    public Doctors() {
    }

    public Doctors(int id, @Email(message = "*Please provide a valid Email") String email, String name, String category) {
        this.id = id;
        this.email = email;
        this.name = name;
        Category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }
}
