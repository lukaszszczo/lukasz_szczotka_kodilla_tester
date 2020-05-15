package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import java.util.Set;



public class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/integerNumbers.csv", numLinesToSkip = 1)
    public void shouldGetNumberOfWins (Set<Integer> numbers ) throws InvalidNumbersException {


    gamblingMachine.howManyWins(numbers);



    }

}