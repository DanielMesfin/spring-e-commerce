package com.daniel.springweb.model;


import jakarta.persistence.*;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @ManyToOne
    private User user;

    public Category() {
    }

    public Category(String name, String description , User userId) {
        this.name = name;
        this.description = description;
        this.user=userId;
    }

    public User getUser() {
        return user;
    }

    public void serUser(User user) {
        this.user= user;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
// Getters and Setters
}
