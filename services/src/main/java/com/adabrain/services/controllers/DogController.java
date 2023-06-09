package com.adabrain.services.controllers;

import com.adabrain.services.interfaces.DogRepository;
import com.adabrain.services.models.Dog;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dogs")
public class DogController {
    private final DogRepository dogRepository;

    public  DogController(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
        this.dogRepository.saveAll(List.of(
                new Dog("Afador"),
                new Dog("Akita"),
                new Dog("American Eskimo Dog"),
                new Dog("Alusky")
        ));
    }

    @GetMapping
    public Iterable<Dog> getDogs() {
        return this.dogRepository.findAll();
    }

//    @GetMapping("/getByBreed/{breedName}")
//    public Optional<Dog> getDogByBreedName(@PathVariable String breedName) {
//        for (Dog d : this.dogs) {
//            if (d.getBreed().equals(breedName)) {
//                return Optional.of(d);
//            }
//        }
//
//        return Optional.empty();
//    }

    @GetMapping("/getById/{id}")
    public Optional<Dog> getDogById(@PathVariable String id) {
        return this.dogRepository.findById(id);
    }

    @PostMapping
    public Dog postDog(@RequestBody Dog dog) {
        this.dogRepository.save(dog);
        return dog;
    }

    @PutMapping("updateDog/{id}")
    public ResponseEntity<Dog> putDog(@PathVariable String id, @RequestBody Dog newDog) {
        return (this.dogRepository.existsById(id)) ?
                new ResponseEntity<Dog>(newDog, HttpStatus.OK)
                : new ResponseEntity<Dog>(this.postDog(newDog), HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteDog/{id}")
    public HttpStatus deleteDog(@PathVariable String id) {
        if (dogRepository.existsById(id)) {
            dogRepository.deleteById(id);
            return HttpStatus.OK;
        }
        return HttpStatus.NO_CONTENT;
    }
}
