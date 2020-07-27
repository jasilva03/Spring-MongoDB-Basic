package com.example.mongodbbasicexample.repositories;

import com.example.mongodbbasicexample.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, String> {



}
