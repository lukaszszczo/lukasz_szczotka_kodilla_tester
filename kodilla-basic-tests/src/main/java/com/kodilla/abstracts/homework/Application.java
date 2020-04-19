package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 12);
//        rectangle.field();
//        rectangle.circumference();

        Shape square = new Square(10);
//        square.field();
//        square.circumference();

        Shape pane = new Pane(10, 20, 30);
//        pane.field();
//        pane.circumference();

        Shape shapes[] = new Shape[] {rectangle, square, pane};

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].field();
            shapes[i].circumference();
        }
    }
}
