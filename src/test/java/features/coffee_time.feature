Feature: Serve coffee

  Scenario: Buy last coffee
#    Given there <залишок> coffees left in machine
    Given there 10 coffees left in machine
#    When I deposit a <кошти> dollar
    When I deposit a 777 dollar
    And I press the coffee button
    Then I should be served a coffee

  Scenario Outline: Buy coffee
    Given there <count> coffees left in machine
    When I deposit a <cost> dollar
    And I press the coffee button
    Then I should be served a coffee

    Examples:
      | count | cost |
      | 10    | 7    |
      | 11    | 12   |
      | 12    | 13   |