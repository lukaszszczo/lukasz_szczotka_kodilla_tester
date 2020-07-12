package fizzBuzz;

import io.cucumber.java8.En;
import org.junit.Assert;
import fizzBuzz.FizzBuzz;


public class isItFizzOrBuzz implements En {

    private int number;
    private String result;

    public isItFizzOrBuzz() {

        Given("number is 1", () -> {
            this.number = 1;
        });


        Given("number is 3", () -> {
            this.number = 3;
        });


        Given("number is 5", () -> {
            this.number = 5;
        });


        Given("number is 15", () -> {
            this.number = 15;
        });


        Given("number is 2", () -> {
            this.number = 2;
        });


        Given("number is 16", () -> {
            this.number = 16;
        });


        Given("number is 98", () -> {
            this.number = 98;
        });


        Given("number is 90", () -> {
            this.number = 90;
        });

        When("I run program", () -> {
            FizzBuzz fizzBuzz = new FizzBuzz();
            this.result = fizzBuzz.isItFizz(this.number);
        });

        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, this.result);
        });


    }
}