package com.example.springbootintrotest.testMe;

public class Cat implements Animal{

    public Cat() {
        makeSound();
    }

    @Override
    public void makeSound() {
        System.out.println("Created Cat");
    }
}
