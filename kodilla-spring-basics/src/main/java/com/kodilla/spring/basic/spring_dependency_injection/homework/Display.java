package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Display {
    void display(double value){
        System.out.println("Twoj wynik to: " + value);
    }

}
