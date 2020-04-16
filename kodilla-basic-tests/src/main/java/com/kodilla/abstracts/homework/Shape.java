package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int width;
    private int height;
    private int length;

    public Shape(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public abstract void field();

    public abstract void circumference();


}

