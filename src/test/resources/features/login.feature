
Feature: As a user, I should be able to login to TryCloud app

  Background:


  Scenario Outline: verify user login successfully "<username>"
    Given user on the login page
    When user enter valid "<username>" and "<password>"
    And  user click login button
    Then user should be at dashboard page
    Examples:
      | username | password    |
      | User7    | Userpass123 |
      | User34   | Userpass123 |
      | User99   | Userpass123 |






