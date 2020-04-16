package com.kodilla.abstracts.homework;

public class Square extends Shape {
    public Square(int width, int height, int length) {
        super(width, height, length);
    }

    @Override
    public void field() {

        System.out.println("pole kwadratu " + ((getWidth() * getHeight())));

    }

    @Override
    public void circumference() {
        System.out.println("obwód kwadratu " + (getWidth() + getWidth()));

    }


}
