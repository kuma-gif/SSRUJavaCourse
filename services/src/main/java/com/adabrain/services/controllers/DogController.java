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
//    private  final DogRepository dogRepository;
    private ArrayList<Dog> dogs = new ArrayList<Dog>();

//    public DogController(DogRepository dogRepository) {
//        this.dogRepository = dogRepository;
//        this.dogRepository.saveAll(List.of(
//                new Dog("Afador"),
//                new Dog("Akita"),
//                new Dog("American Eskimo Dog"),
//                new Dog("Alusky")
//        ));
//    }

    public  DogController() {
        this.dogs.addAll(List.of(
                new Dog("Afador"),
                new Dog("Akita"),
                new Dog("American Eskimo Dog"),
                new Dog("Alusky")
        ));
    }

    @GetMapping
    public Iterable<Dog> getDogs() {
        return this.dogs;
    }

    @GetMapping("/getByBreed/{breedName}")
    public Optional<Dog> getDogByBreedName(@PathVariable String breedName) {
        for (Dog d : this.dogs) {
            if (d.getBreed().equals(breedName)) {
                return Optional.of(d);
            }
        }

        return Optional.empty();
    }

    @PostMapping
    public Dog postDog(@RequestBody Dog dog) {
        this.dogs.add(dog);
        return dog;
    }

    @PutMapping("updateDog/{id}")
    public ResponseEntity<Dog> putDog(@PathVariable String id, @RequestBody Dog newDog) {
        int dogIdx = -1;
        for(Dog d : this.dogs) {
            if (d.getId().equals(id)) {
                dogIdx = this.dogs.indexOf(d);

                // Update data
                this.dogs.set(dogIdx, newDog);
            }
        }

        // If dogIdx is equal to -1 then create new dog from postDog() API
        // Else return dog data got from RequestBody
        return (dogIdx == -1) ?
                new ResponseEntity<Dog>(this.postDog(newDog), HttpStatus.CREATED)
                : new ResponseEntity<Dog>(newDog, HttpStatus.OK);
    }

    @DeleteMapping("/deleteDog/{id}")
    public HttpStatus deleteDog(@PathVariable String id) {
        boolean isDeleted = this.dogs.removeIf(d -> d.getId().equals(id));

        return isDeleted ? HttpStatus.OK : HttpStatus.NO_CONTENT;
    }
}
