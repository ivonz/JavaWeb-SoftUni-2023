package com.example.springbootintrotest.testMe;

public class Dog implements Animal{

    public Dog() {
        makeSound();
    }

    @Override
    public void makeSound() {
        System.out.println("Created Dog");
    }
}
