
Feature: As a user, I should be access all the main modules of the app.

  @wip1
  Scenario: As a user, I should be access all the main modules of the app.
    Given user on the login page
    When user  log in with valid credentials
    Then Verify the user see the following modules:
      | Dashboard |
      | Files     |
      | Photos    |
      | Activity  |
      | Talk      |
      | Mail      |
      | Contacts  |
      | Circles   |
      | Calendar  |
      | Deck      |