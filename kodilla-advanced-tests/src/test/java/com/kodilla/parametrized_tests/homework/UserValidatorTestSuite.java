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
    @ValueSource(strings = {"aAzZ0.-_\n", "aaa\n", "...\n", "ooo\n", "000\n"})   /* nie rozumiem \n 	czemu w  metodzie validateUsername wymagane jest zrobienie nowej lini */
    public void shouldReturnTrueIfValidateIsCorrect(String username) {
        boolean result = test.validateUsername(username);
        assertTrue(result);

    }

    @ParameterizedTest
    @ValueSource(strings = {"aA\n", "a\n", "\n"})
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
    @ValueSource(strings = {" @.pl, ", "0@0.0", "t@t.", "", "t@333333"})
    // dopisalem && !email.isEmpty() do metody bo przeuszczal pustego stringa
    public void shouldReturnFalseifEmailIsFalse(String email) {
        boolean result = test.validateEmail(email);
        assertFalse(result);


    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsEmpty_Email(String email) {
        assertTrue(validator.isBlank(email));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsEmpty(String username) {
        assertTrue(validator.isBlank(username));
    }
}