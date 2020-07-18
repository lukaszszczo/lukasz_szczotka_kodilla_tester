Feature: Cash prevent wrong amount
    Scenario: Cash prevent wrong amount
        Given I have deposited 200$ in my wallet
        When I requested 0$
        Then the balance of my wallet should be exacly 200$
        And I should be told that Wrong amount

