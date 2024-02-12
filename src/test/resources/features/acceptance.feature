Feature: Functional tests

    Scenario: I can get the right message
        Given I am starting the program
        Then I get the hello world message
        And I get the wrong message
