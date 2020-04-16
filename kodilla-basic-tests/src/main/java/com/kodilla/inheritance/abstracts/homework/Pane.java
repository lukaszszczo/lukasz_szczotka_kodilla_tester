package com.kodilla.inheritance.abstracts.homework;

public class Pane extends Shape {
    public Pane(int width, int height, int length) {
        super(width, height, length);
    }

    @Override
    public void field() {

        System.out.println("pole rombu " + ((getWidth() * getHeight())));

    }

    @Override
    public void circumference() {
        System.out.println("obwód rombu " + (4 * (getLength())));

    }


}
