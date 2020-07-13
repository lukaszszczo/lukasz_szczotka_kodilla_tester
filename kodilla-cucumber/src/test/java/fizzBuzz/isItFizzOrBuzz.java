package fizzBuzz;

import io.cucumber.java8.En;
import org.junit.Assert;
import fizzBuzz.FizzBuzz;


public class isItFizzOrBuzz implements En {

    private int number;
    private String result;

    public isItFizzOrBuzz() {

        Given("number is {int}", (Integer integer) -> {
            this.number = integer;
        });

        Given("number is null", () -> {
            this.number = Integer.parseInt(null);
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