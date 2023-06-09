package com.adabrain.services.interfaces;

import com.adabrain.services.models.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, String> { }
