Feature: Is it Fizz or Buzz?

Scenario Outline: FizzBuzz scenario
      Given number is <number>
      When I run program
      Then I should be told <result>
      Examples:
      | number | result |
      | 1 | "None" |
      | -3 | "Fizz" |
	  | 5 | "Buzz" |
	  | 15 | "FizzBuzz" |
	  | 2 | "None" |
	  | 0 | "None" |
	  | 90 | "FizzBuzz" |