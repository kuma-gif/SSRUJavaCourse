package com.adabrain.services.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Dog {
    @Id
    private String id;
    private String breed;

    public  Dog() {}
    public Dog(String id, String breed) {
        this.id = UUID.randomUUID().toString();
        this.breed = breed;
    }

    public Dog(String breed) {
        this(UUID.randomUUID().toString(), breed);
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
