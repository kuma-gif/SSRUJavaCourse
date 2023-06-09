package com.adabrain.services.controllers;

import com.adabrain.services.models.Dog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DogController {
    private ArrayList<Dog> dogs = new ArrayList<>();

    public DogController() {
        dogs.addAll(List.of(
                new Dog("Afador"),
                new Dog("Akita"),
                new Dog("American Eskimo Dog"),
                new Dog("Alusky")
        ));
    }

    @GetMapping("/dogs")
    public Iterable<Dog> getDogs() {
        return this.dogs;
    }
}
