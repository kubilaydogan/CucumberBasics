Feature: Menu Management

  Scenario: Orders
    Given we have a menu with following items
    | item              | price |
    | Cucumber Salad    | 10    |
    | Cucumber Sandwich | 15    |
    | Juice             | 3     |
    When customer orders "Cucumber Salad"
    And customer orders "Cucumber Sandwich"
    And customer orders "Juice"
    Then verify the customer should pay 28 dollars
