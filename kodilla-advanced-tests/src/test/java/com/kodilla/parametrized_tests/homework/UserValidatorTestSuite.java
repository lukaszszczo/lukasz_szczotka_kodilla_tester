package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {

    private UserValidator test = new UserValidator();
    private StringValidator validator = new StringValidator();

    @ParameterizedTest
    @ValueSource(strings = {"aAzZ0.-_", "aaa", "...", "ooo", "000"})
    public void shouldReturnTrueIfValidateIsCorrect(String username) {
        boolean result = test.validateUsername(username);
        assertTrue(result);

    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"aA", "a", ""})
    public void shouldReturnFalseIfValidateIsFalse(String username) {
        boolean result = test.validateUsername(username);
        assertFalse(result);

    }


    @ParameterizedTest
    @ValueSource(strings = {"_aA0-._aA0-@aA0-.aA0-.aZ", "lukasz.szczotka@onet.pl", "t@asdasdasd.com.pl", "test@test.pl", "sdfgsdfgsmdflkgmsdlkfmglflkasdmfl@dfkjaskdfhkajsdhfkjashdfksdfgsdfgsdfgs.azazaz"})
    public void shouldReturnTrueifEmailIsCorrect(String email) {
        boolean result = test.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {" @.pl, ", "0@0.0", "t@t.", "", "t@333333"})
    // dopisalem && !email.isEmpty() do metody bo przeuszczal pustego stringa
    public void shouldReturnFalseifEmailIsFalse(String email) {
        boolean result = test.validateEmail(email);
        assertFalse(result);


    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnFalseifNullAndEmptySourceEmail(String email) {
        boolean result = test.validateEmail(email);
        assertFalse(result);
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnFalseifNullAndEmptySourceUsername(String username) {
        boolean result = test.validateUsername(username);
        assertFalse(result);

    }


}