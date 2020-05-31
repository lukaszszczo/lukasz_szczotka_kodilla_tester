package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


@Configuration
public class CarConfiguration {

    private boolean randomHours() {
        Random random = new Random();
        int result = random.nextInt(25);
        if (result > 22 && result < 6)
        {
            return true;
        }
            return false;

    }

    private String randomMonth() {
        List<String> seasonList = Arrays.asList("Winter", "Spring", "Summer", "Autumn");
        Random random = new Random();
        int result = random.nextInt(3);
        return seasonList.get(result);
    }

    @Bean
    public Car pickRandomCar() {
        Car car = null;
        String season = randomMonth();

        if (season == "Winter") {
            car = new SUV();
            randomHours();

        } else if (season == "Summer") {
            car = new Cabrio();
            randomHours();
        } else if (season == "Autumn" || season == "Spring") {
            car = new Sedan();
            randomHours();
        }

        return car;
    }


}
