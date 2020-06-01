package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;
import java.util.Random;

import static java.time.LocalTime.of;

public interface Car {

    default boolean hasHeadlightsTurnedOn() {

        Random random = new Random();
        int hour = random.nextInt(5);
        LocalTime now = LocalTime.of(hour, 0);

        if (now.isAfter(of(22, 0)) || now.isBefore(of(6, 0))) {
            return true;
        } else {
            return false;
        }
    }

    String getCarType();
}
