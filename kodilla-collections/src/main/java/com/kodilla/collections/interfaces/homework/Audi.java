package com.kodilla.collections.interfaces.homework;

public class Audi implements Car {

    private String name;
    private int speed;
    private int increaseSpeed;
    private int decreaseSpeed;

    public Audi(String name, int speed, int increaseSpeed, int decreaseSpeed) {
        this.name = name;
        this.speed = speed;
        this.increaseSpeed = increaseSpeed;
        this.decreaseSpeed = decreaseSpeed;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getRandomSpeed() {
        return speed + increaseSpeed;
    }

    @Override
    public void increaseSpeed() {
        speed += increaseSpeed;
    }

    @Override
    public void decreaseSpeed() {
        speed -= decreaseSpeed;
    }
}
