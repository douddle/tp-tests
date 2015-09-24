Feature: UserBetManager

  Scenario: Check user money amount if he is losing his bet
    Given an user with 50 euros
    When he bets 25 euros on number 9 and the number 4 is out
    Then the user has 25 euros