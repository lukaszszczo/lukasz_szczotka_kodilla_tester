package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("--------------------");
        System.out.println("Nazwa auta to: " + getCarName(car));
        System.out.println("Predkosc startowa to: " + car.getSpeed());
        System.out.println("Finalna predkość to: " + car.getRandomSpeed());
        System.out.println("Jeszcze raz nazwa auta wypisana inna metodą " + car.getName());
    }

    private static String getCarName(Car car) {
        if (car instanceof Audi)
            return "Audi";
        else if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Opel)
            return "Opel";
        else
            return "Uknown car name";
    }
}




