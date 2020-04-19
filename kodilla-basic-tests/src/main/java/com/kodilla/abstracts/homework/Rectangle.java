package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void field() {
        System.out.println("pole prostokąta " + (width * width));
    }

    @Override
    public void circumference() {
        System.out.println("obwód prostokata " + 2 * (width + width));
    }

    public void myMethod() {

    }

}
