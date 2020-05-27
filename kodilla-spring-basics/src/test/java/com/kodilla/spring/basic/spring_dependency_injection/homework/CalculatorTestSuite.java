package com.kodilla.spring.basic.spring_dependency_injection.homework;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    Calculator bean = context.getBean(Calculator.class);


    @Test
    public void shouldCorrectAdd() {

        Double result = bean.add(1, 1);
        assertEquals(2, result, 0.001);

    }

    @Test
    public void shouldCorrectAddForMinus() {

        Double result = bean.add(-1, -1);
        assertEquals(-2, result, 0.001);

    }

    @Test
    public void shouldCorrectAddZero() {

        Double result = bean.add(0, 0);
        assertEquals(0, result, 0.001);

    }

    @Test
    void shouldCorrectSubtract() {
        Double result = bean.subtract(5, 3);
        assertEquals(2, result, 0.001);
    }

    @Test
    void shouldCorrectSubtractZero() {
        Double result = bean.subtract(0, 0);
        assertEquals(0, result, 0.001);
    }

    @Test
    void shouldCorrectSubtractForMinus() {
        Double result = bean.subtract(-2, -3);
        assertEquals(1, result, 0.001);
    }

    @Test
    void shouldCorrectMultiply() {
        Double result = bean.multiply(5, 3);
        assertEquals(15, result, 0.001);
    }

    @Test
    void shouldCorrectMultiplyZero() {
        Double result = bean.multiply(0, 0);
        assertEquals(0, result, 0.001);
    }

    @Test
    void shouldCorrectMultiplyForMinus() {
        Double result = bean.multiply(-5, -3);
        assertEquals(15, result, 0.001);
    }

    @Test
    void shouldCorrectDivide() {
        Double result = bean.divide(4, 3);
        assertEquals(1.333, result, 0.001);

    }

    @Test
    void shouldCorrectDivideForMinus() {
        Double result = bean.divide(-90, -30);
        assertEquals(3, result, 0.001);

    }

    @Test
    void shoulNotDivideZero() {
        Double result = bean.divide(0, 0);
        assertEquals(0, result, 0.001);

    }

}