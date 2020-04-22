package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Audi("Audi", 0, 10, 5));
        cars.add(new Opel("Opel", 0, 20, 10));
        cars.add(new Ford("Ford", 0, 30, 20));


        System.out.println("Wielosc listy to: " + cars.size());
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println();
        System.out.println();
        System.out.println();

        Opel opel = new Opel("Opel", 0, 20, 10);
        cars.remove(0);
        cars.remove(opel);

        System.out.println("Wielosc listy to: " + cars.size());
        System.out.println("Ponowne wypisanie listy:");
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

    }
}
