package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {

        /*Ford ford = new Ford("Ford",0, 30, 15);
        Opel opel = new Opel("Opel",0, 35, 10);
        Audi audi = new Audi("Audi",0, 50, 20);*/

/*
        doRace(ford);
        doRace(opel);
        doRace(audi);*/

        Car[] cars = new Car[] {
                new Ford("Ford",0, 30, 15),
                new Opel("Opel",0, 35, 10),
                new Audi("Audi",0, 50, 20)
        };

        for (Car car:cars) {
            doRace(car);
        }

    }

    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println("Finalna predkość auta marki: " + car.getName() + " to: " + car.getSpeed()+ " km/h");
    }
}



