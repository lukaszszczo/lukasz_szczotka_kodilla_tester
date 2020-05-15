package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class WrongPersonSources {

    static Stream<Arguments> provideWrongDataForTestingBmi() {
        return Stream.of(

                Arguments.of(0, 0),
                Arguments.of(0, 1),
                Arguments.of(1, 1),
                Arguments.of(1, 0),
                Arguments.of(-1, 0),
                Arguments.of(0, 0)
        );
    }
}