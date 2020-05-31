package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;


@SpringBootTest

public class CarConfigurationTestSuite {


    @Test
    public void shouldCreateRandomCar() {
        //Given
       ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
       Car car = (Car) context.getBean("pickRandomCar");

       //When
       String cars = car.getCarType();

       //then

        List<String> possibleCars = Arrays.asList("SUV", "Cabrio", "Sedan");
        Assertions.assertTrue(possibleCars.contains(cars));



    }
}