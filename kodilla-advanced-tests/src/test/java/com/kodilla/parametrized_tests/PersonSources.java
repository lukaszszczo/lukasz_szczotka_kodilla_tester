package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {

    static Stream<Arguments> provideDataForTestingBmi() {
        return Stream.of(

                Arguments.of(1.77, 39, "Very severely underweight"),
                Arguments.of(1.77, 49, "Severely underweight"),
                Arguments.of(1.77, 57, "Underweight"),
                Arguments.of(1.77, 77, "Normal (healthy weight)"),
                Arguments.of(1.77, 88, "Overweight"),
                Arguments.of(1.77, 109, "Obese Class I (Moderately obese)"),
                Arguments.of(1.77, 119, "Obese Class II (Severely obese)"),
                Arguments.of(1.77, 133, "Obese Class III (Very severely obese)"),
                Arguments.of(1.77, 143, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.77, 163, "Obese Class V (Super Obese)")

        );
    }
}