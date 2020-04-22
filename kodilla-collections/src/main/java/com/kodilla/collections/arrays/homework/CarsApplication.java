package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.Random;

public class CarsApplication {
    public static Car drawCar() {
        Random random = new Random();
        int drawnCarsKind = random.nextInt(3);
        // zastanawialem sie czy zrobic tutaj random.nextInt jedna lub dwie zmienne dla speed i increaseSpeed
        if (drawnCarsKind == 0)
            return new Opel("Opel", random.nextInt(20), random.nextInt(80), 15);
        else if (drawnCarsKind == 1)
            return new Ford("Ford", random.nextInt(20), random.nextInt(80), 15);
        else
            return new Audi("Audi", random.nextInt(20), random.nextInt(80), 20);
    }

    static int randomDrawBetween(int start, int end) {       // metoda losujaca z zakresu jaki sobie ustawimy
        Random random = new Random();
        int draw1 = random.nextInt(end - start + 1);
        int draw2 = draw1 + start;
        return draw2;
    }

    public static void main(String[] args) {
        Random random = new Random();

        Car[] cars = new Car[randomDrawBetween(1, 15)];
        System.out.println("--------------------");
        System.out.println("Wylosowano: " + cars.length + " aut");
        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);


    }

}


