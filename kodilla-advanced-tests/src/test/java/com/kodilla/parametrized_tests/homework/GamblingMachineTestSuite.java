package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;



public class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/correctIntegerNumbers.csv")
    public void shouldGetCorrectNumberOfWins (int number1, int number2, int number3, int number4, int number5, int number6) throws InvalidNumbersException {

        Set<Integer> numbers = new HashSet<>();
        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);
        numbers.add(number5);
        numbers.add(number6);

        assertTrue(gamblingMachine.howManyWins(numbers) >= 0 && gamblingMachine.howManyWins(numbers) <= 6);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/incorrectIntegerNumbers.csv")
    public void shouldGetException (int number1, int number2, int number3, int number4, int number5, int number6) throws InvalidNumbersException {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);
        numbers.add(number5);
        numbers.add(number6);

       assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(numbers);
            System.out.println(numbers);

    });

    }

}