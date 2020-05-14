package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {

    static Stream<Arguments> provideDataForTestingBmi() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(0, 66),
                Arguments.of(1, 66),
                Arguments.of(1.7, 0),
                Arguments.of(-1, 66),
                Arguments.of(1.8, -500),
                Arguments.of(1, 1),
                Arguments.of(-1, -1),
                Arguments.of(0.001, 0.001),
                Arguments.of(1.75, 88),
                Arguments.of(1.84, 100),
                Arguments.of(1.98, 130),
                Arguments.of(1.43, 55),
                Arguments.of(1.66, 78),
                Arguments.of(1.88, 345345345),
                Arguments.of(1.77, 74),
                Arguments.of(45345345, 99)
        );
    }
}