package com.kodilla.parametrized_tests.homework;

import com.kodilla.parametrized_tests.PersonSources;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.PersonSources#provideDataForTestingBmi")
    public void shouldCalculateBmi(double heightInMeters, double weightInKilogram) {

        Person person = new Person(heightInMeters, weightInKilogram);
        System.out.println(person.getBMI());

    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldNotCalculateNullAndEmpty(double heightInMeters, double weightInKilogram) {
        Person person = new Person(heightInMeters, weightInKilogram);
        person.getBMI();

    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.PersonSources#provideDataForTestingBmi")
    public void shouldCalculateBmi_under_15(double heightInMeters, double weightInKilogram) {

        Person person = new Person(heightInMeters, weightInKilogram);
        double bmi = weightInKilogram / (heightInMeters * heightInMeters);

        assertTrue(bmi < 15, "Very severely underweight");
    }

}