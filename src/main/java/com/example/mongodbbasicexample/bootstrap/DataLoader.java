package com.example.mongodbbasicexample.bootstrap;

import com.example.mongodbbasicexample.model.Pet;
import com.example.mongodbbasicexample.model.Person;
import com.example.mongodbbasicexample.repositories.PersonRepository;
import com.example.mongodbbasicexample.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    PetRepository petRepository;

    @Override
    public void run(String... args) throws Exception {

        petRepository.deleteAll();
        personRepository.deleteAll();

        Pet pet = new Pet();
        pet.setType("Dog");
        pet.setName("Willy");
        petRepository.save(pet);

        Person p = new Person();
        p.setSurname("Silva");
        p.setName("Ariel");
        p.setPet(pet);

        personRepository.save(p);

    }

}
