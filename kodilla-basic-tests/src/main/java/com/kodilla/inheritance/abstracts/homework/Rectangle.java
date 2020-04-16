package com.kodilla.inheritance.abstracts.homework;

public class Rectangle extends Shape {
    public Rectangle(int width, int height, int length) {
        super(width, height, length);
    }

    @Override
    public void field() {

        System.out.println("pole prostokąta " + (getWidth() * getHeight()));

    }

    @Override
    public void circumference() {
        System.out.println("obwód prostokata " + 2 * (getWidth() + getHeight()));

    }


}
