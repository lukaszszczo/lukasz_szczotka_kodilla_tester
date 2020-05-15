package com.kodilla.parametrized_tests.homework;

import com.kodilla.parametrized_tests.PersonSources;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.PersonSources#provideDataForTestingBmi")
    public void shouldCalculateCorrectBmi(double heightInMeters, double weightInKilogram, String expectedOutput) {

        Person person = new Person(heightInMeters, weightInKilogram);
        String result = person.getBMI();
        assertEquals(expectedOutput, result);

    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldNotCalculateNullAndEmpty(double heightInMeters, double weightInKilogram) {
        Person person = new Person(heightInMeters, weightInKilogram);
        person.getBMI();

    }
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.WrongPersonSources#provideWrongDataForTestingBmi")
    public void shouldCalculateWrongBmi(double heightInMeters, double weightInKilogram) {
        Person person = new Person(heightInMeters, weightInKilogram);
        String result = person.getBMI();
        System.out.println(result);

    }

}