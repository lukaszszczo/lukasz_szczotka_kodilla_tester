package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


@Configuration
public class CarConfiguration {

    // bawilem sie z bilbioteka Date ale przeroslo mnie to, wygenerowanie losowej daty nie bylo problemem co pozniej filtracja tego.
    // wiec troche uproscilem to... godziny losowane sa z zakresu 0-24 a pory roku tak jak ponizej
    private boolean randomHours() {
        Random random = new Random();
        int result = random.nextInt(25);

        if (result >= 22 || result <= 6) {

            return true;
        } else {

            return false;
        }

    }
    private String randomMonth() {
        List<String> seasonList = Arrays.asList("Winter", "Spring", "Summer", "Autumn");
        Random random = new Random();
        int result = random.nextInt(3);
        return seasonList.get(result);
    }

    @Bean
    public Car pickRandomCar() {
        Car car;
        String season = randomMonth();
        boolean lights = randomHours();

        if (season == "Winter") {
            car = new SUV();

        } else if (season == "Summer") {
            car = new Cabrio();

        } else if (season == "Autumn" || season == "Spring") {
            car = new Sedan();

        }

        return car;
    }


}
