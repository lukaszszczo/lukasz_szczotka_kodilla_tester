package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    double add(double a, double b) {
        return display.display(a + b);
    }

    double subtract(double a, double b) {
        return display.display(a - b);

    }

    double multiply(double a, double b) {
        return display.display(a * b);
    }

    double divide(double a, double b) {
        if (b == 0) {
            return 0;
        } else {
            return display.display(a / b);
        }
    }


}
