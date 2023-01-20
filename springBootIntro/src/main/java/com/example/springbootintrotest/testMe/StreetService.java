package com.example.springbootintrotest.testMe;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class StreetService {

    private final Animal dog;
    private final Animal cat;

    public StreetService(Animal dog, @Qualifier("createCat") Animal cat) {

        System.out.println("im on the street");
        this.dog = dog;
        this.cat = cat;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("post construct of street");
        this.cat.makeSound();
        this.dog.makeSound();
        System.out.println(this.cat.hashCode());
        System.out.println(this.dog.hashCode());
    }
}
