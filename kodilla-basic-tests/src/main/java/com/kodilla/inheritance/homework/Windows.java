package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {


    public Windows(String name, int age) {
        super(name, age);
    }

    @Override
    public void turnOn() {
        System.out.println("Uruchamiam system operacyjny napisujacaca metoda");

    }

    @Override
    public void turnOf() {
        System.out.println("Wylaczam system operacyjny napisujaca metoda");
    }

}
