package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private String name;
    private int age;

    public OperatingSystem(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void turnOn() {
        System.out.println("Uruchamiam system operacyjny");

    }

    public void turnOf() {
        System.out.println("Wylaczam system operacyjny");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
