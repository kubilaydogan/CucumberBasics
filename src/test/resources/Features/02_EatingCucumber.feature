@cucumber
Feature: Examples of Data Sets

  We use scenario outline, to run the same scenario multiple times with different sets of data

  Scenario Outline: eating
    Given there are <start> cucumbers
    When I eat <eat> cucumbers
    Then I should have <left> cucumbers

    Examples:
      | start | eat | left |
      |    12 |   5 |    7 |
      |    20 |   5 |   15 |
      |    23 |   3 |   20 |
      |    15 |  15 |    0 |
