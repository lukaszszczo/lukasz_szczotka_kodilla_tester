package com.kodilla.parametrized_tests.homework;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GamblingMachine {

    public int howManyWins(Set<Integer> userNumbers) throws InvalidNumbersException { /// set z moimi int
        validateNumbers(userNumbers); // uruchamia metode sprawdzajaca s
        Set<Integer> computerNumbers = generateComputerNumbers(); // tworzy liste i uruchamia metoda ktora generuje int komputra
        int count = 0;
        for (Integer number : userNumbers) { // petla liczy ile liczb sie zgadza jzeli zgadza to count ++ i go pozniej zwraca i podaje wynik
            if (computerNumbers.contains(number)) {
                count++;
            }
        }
        return count;
    }

    private void validateNumbers(Set<Integer> numbers) throws InvalidNumbersException {
        if (numbers.size() != 6) {
            throw new InvalidNumbersException();
        }

        if (numbers.stream().anyMatch(number -> number < 1)) {
            throw new InvalidNumbersException();
        }
    }

    private Set<Integer> generateComputerNumbers() {
        Set<Integer> numbers = new HashSet<>();
        Random generator = new Random();
        while(numbers.size() < 6) {
            numbers.add(generator.nextInt(49) + 1);
        }
        return numbers;
    }
}
