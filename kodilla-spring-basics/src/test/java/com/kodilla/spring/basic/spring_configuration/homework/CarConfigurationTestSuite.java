package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest

public class CarConfigurationTestSuite {


    @Test
    public void shouldCreateRandomCar() {
        //Given
       ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
       Car car = (Car) context.getBean("pickRandomCar");




    }
}