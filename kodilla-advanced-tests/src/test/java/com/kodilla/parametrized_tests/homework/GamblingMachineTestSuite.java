package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;



public class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/integerNumbers.csv")
    public void shouldGetNumberOfWins (int numbers) throws InvalidNumbersException {
        Set<Integer> tempSet = new HashSet<>();
        tempSet.add(numbers);

        System.out.println(gamblingMachine.howManyWins(tempSet));


    }

}