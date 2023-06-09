package com.adabrain.services.models;

import java.util.UUID;

public class Dog {
    private final String id = UUID.randomUUID().toString();
    private String breed;

    public Dog(String id, String breed) {
        this.breed = breed;
    }

    public Dog(String breed) {
        this(UUID.randomUUID().toString(), breed);
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
