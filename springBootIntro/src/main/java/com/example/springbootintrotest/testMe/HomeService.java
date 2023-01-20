package com.example.springbootintrotest.testMe;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {

    private final Animal dog;
    private final Animal cat;
    private final List<Animal> animals;

    @Autowired
    public HomeService(Animal dog, @Qualifier("createCat") Animal cat, List<Animal> animalList) {
        System.out.println("I'm in home");
        this.dog = dog;
        this.cat = cat;
        this.animals = animalList;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("post construct of home");
        this.cat.makeSound();
        this.dog.makeSound();
        System.out.println(this.cat.hashCode());
        System.out.println(this.dog.hashCode());
        System.out.println("List of animals:");
        System.out.println("List of animals:");
        this.animals.forEach(Animal::makeSound);
    }
}
