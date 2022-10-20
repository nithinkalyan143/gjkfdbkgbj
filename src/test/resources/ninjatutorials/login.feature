Feature: login feature
  Scenario: logging
    Given user opened browser and entered url
    When user entered username and password
    And user clicked on login
    Then User must be able to land on login page