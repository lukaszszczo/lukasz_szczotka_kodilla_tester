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
    public void shouldGetCorrectNumberOfWins (Integer number1, Integer number2, Integer number3, Integer number4, Integer number5, Integer number6) throws InvalidNumbersException {

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
    public void shouldGetExceptionIncorectRange (Integer number1, Integer number2, Integer number3, Integer number4, Integer number5, Integer number6) throws InvalidNumbersException {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);
        numbers.add(number5);
        numbers.add(number6);

       assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(numbers);
    });

    }
    @ParameterizedTest
    @CsvFileSource(resources = "/incorrectLengthIntegerNumbers.csv")
    public void shouldGetExceptionIncorectLengthNumber (Integer number1, Integer number2, Integer number3, Integer number4, Integer number5) throws InvalidNumbersException { // Dla kazdej ilosci argumentow mialbym robic test róznej od 6 ?
        Set<Integer> numbers = new HashSet<>();
        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);
        numbers.add(number5);

        assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(numbers);
        });
    }
        @ParameterizedTest
        @CsvFileSource(resources = "/incorrectLengthIntegerNumbersPlusOne.csv")
        public void shouldGetExceptionIncorectLengthNumberPlusOne(Integer number1, Integer number2, Integer number3, Integer number4, Integer number5, Integer number6, Integer number7) throws InvalidNumbersException {
            Set<Integer> numbers = new HashSet<>();
            numbers.add(number1);
            numbers.add(number2);
            numbers.add(number3);
            numbers.add(number4);
            numbers.add(number5);
            numbers.add(number6);
            numbers.add(number7);

            assertThrows(InvalidNumbersException.class, () -> {
                gamblingMachine.howManyWins(numbers);
            });

    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldGetExceptionNullAndEmpty (Set<Integer> userNumbers) { // hmm nie wiem.
        assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(userNumbers);
        });

    }




}