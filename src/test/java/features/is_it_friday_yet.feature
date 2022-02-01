Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario: Sunday isn't Friday
    Given today is Sunday
    When I ask whether it's Friday yet
    Then I should be told "Nope"


  Scenario Outline: Sunday isn't Friday -_-
    Given today is Sunday
    When I ask whether it's Friday yet
    Then I should be told <word>

    Examples:
      | word   |
      | "Nope" |
      | "Yeap" |