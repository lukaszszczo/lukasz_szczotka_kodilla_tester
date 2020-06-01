package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


@Configuration
public class CarConfiguration {


    @Bean
    public boolean randomHours() {
        Random random = new Random();
        int result = random.nextInt(25);

        if (result >= 22 || result <= 6) {

            return true;
        } else {

            return false;
        }

    }
    @Bean
    public String randomMonth() {
        List<String> seasonList = Arrays.asList("Winter", "Spring", "Summer", "Autumn");
        Random random = new Random();
        int result = random.nextInt(3);
        return seasonList.get(result);
    }

    @Bean
    public Car pickRandomCar() {
        Car car = null; // ????  Variable 'car' might not have been initialized bez nulla
        String season = randomMonth();
        boolean lights = randomHours();

        if (season.equals("Winter")) {
            car = new SUV();

        } else if (season.equals("Summer")) {
            car = new Cabrio();

        } else if (season.equals("Autumn") || season.equals("Spring")) {
            car = new Sedan();

        }

        return car;
    }


}
