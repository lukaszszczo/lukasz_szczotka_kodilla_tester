package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Time;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.Date;

import static org.junit.Assert.*;
@SpringBootTest

public class CarConfigurationTestSuite {


    @Test
    public void shouldCreateRandomCar() {
        //Given
       // ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
       // Car car = (Car) context.getBean("randomCar");

        CarConfiguration carConfiguration = new CarConfiguration();
        System.out.println(carConfiguration.pickRandomCar().hasHeadlightsTurnedOn());
        System.out.println(carConfiguration.pickRandomCar().getCarType());


    }
}