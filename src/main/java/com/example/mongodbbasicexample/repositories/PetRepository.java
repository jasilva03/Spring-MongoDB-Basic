package com.example.mongodbbasicexample.repositories;

import com.example.mongodbbasicexample.model.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends CrudRepository <Pet, String> {



}
