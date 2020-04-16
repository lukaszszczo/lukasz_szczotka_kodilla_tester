package com.kodilla.inheritance.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 12, 0);
        {
            rectangle.field();
            rectangle.circumference();

            Square square = new Square(10, 10, 0);
            {
                square.field();
                square.circumference();
            }
            Pane pane = new Pane(10, 20, 30);
            pane.field();
            pane.circumference();

        }
    }
}
