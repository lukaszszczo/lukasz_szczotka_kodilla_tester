package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Opel implements Car {

    private String name;
    private int speed;
    private int increaseSpeed;
    private int decreaseSpeed;

    public Opel(String name, int speed, int increaseSpeed, int decreaseSpeed) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opel opel = (Opel) o;
        return speed == opel.speed &&
                increaseSpeed == opel.increaseSpeed &&
                decreaseSpeed == opel.decreaseSpeed &&
                Objects.equals(name, opel.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speed, increaseSpeed, decreaseSpeed);
    }
}
