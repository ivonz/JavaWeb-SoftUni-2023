package com.example.springbootintrotest.testMe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfiguration {

    //@Primary
    @Bean(name = "dog")
    @Scope("singleton")
    public Animal createDog() {
        return new Dog();
    }

    @Bean
    public Animal createCat() {
        return new Cat();
    }
}
