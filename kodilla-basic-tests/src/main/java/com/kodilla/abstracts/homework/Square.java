package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void field() {

        System.out.println("pole kwadratu " + ((side * side)));

    }

    @Override
    public void circumference() {
        System.out.println("obwód kwadratu " + (4 * side));

    }


}
