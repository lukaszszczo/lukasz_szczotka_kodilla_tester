package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 5;

        int sumResult = calculator.sum(a, b);
        boolean correctSum = ResultChecker.assertEquals(15, sumResult);
        if (correctSum) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int substractResult = calculator.subtract(a, b);
        boolean correctSubstract = ResultChecker.assertEquals(5, substractResult);
        if (correctSubstract) {
            System.out.println("Metoda substract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda substract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int powResult = calculator.pow(a);
        boolean correctPow = ResultChecker.assertEquals(100, powResult);
        if (correctPow) {
            System.out.println("Metoda pow działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda pow nie działa poprawnie dla liczby " + a);
        }
    }
}
/*
hmm Metoda Math.pow zwraca tylko double wiec pozmienialem wszystko na double.
Na poczatku chcialem zrobic zmienna double c ale wtedy tez trzeba byla osobny ResoultChecker napisac dla double*/
