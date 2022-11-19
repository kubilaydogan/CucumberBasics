@Hear
Feature: Hear shout
  Scenario: Listener is within range
    Given Lucy is located 1 meter from Sean
    When Sean shouts "free bagels at Sean's"
    Then Lucy should hear Sean’s message

  Scenario: Listener hears a different message
    Given Lucy is standing 20 meters from Sean
    When Sean shouts "Free coffee!"
    Then Lucy should hear Sean’s message