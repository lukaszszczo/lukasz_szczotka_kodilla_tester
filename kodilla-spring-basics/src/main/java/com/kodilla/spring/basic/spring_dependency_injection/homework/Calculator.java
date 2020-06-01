package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    double add(double a, double b) {
        double result = display.display(a + b);
        return result;
    }

    double subtract(double a, double b) {
        return display.display(a - b);

    }

    double multiply(double a, double b) {
        double result = display.display(a * b);
        return result;
    }

    double divide(double a, double b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Nie przez zero!");
        } else {
            double result = display.display(a / b);
            return result;

        }
    }


}
