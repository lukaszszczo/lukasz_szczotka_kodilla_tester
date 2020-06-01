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

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

    @Test
    public void shouldCreateRandomCar() {
        //Given

       Car car = (Car) context.getBean("pickRandomCar");

       //When
       String cars = car.getCarType();
        System.out.println(car.getCarType());
        System.out.println(car.hasHeadlightsTurnedOn());
        //then

        List<String> possibleCars = Arrays.asList("SUV", "Cabrio", "Sedan");
        Assertions.assertTrue(possibleCars.contains(cars));

    }



}