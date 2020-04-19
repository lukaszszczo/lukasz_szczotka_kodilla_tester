package com.kodilla.abstracts.homework;

public class Pane extends Shape {
    private int width;
    private int height;
    private int length;

    public Pane(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    @Override
    public void field() {
        System.out.println("pole rombu " + ((width * height)));

    }

    @Override
    public void circumference() {
        System.out.println("obwód rombu " + (4 * (length)));

    }


}
