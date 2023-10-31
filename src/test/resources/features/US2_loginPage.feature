@loginPage @regression
Feature: As a user, I should be able to access login page features.
  1. Verify the users can check the "Remember me on this computer" checkbox on the login page.

  Background: User is on the login page
    Given user is on the login page

  Scenario: Verify the users can check the "Remember me on this computer" checkbox on the login page.
    When user clicks on remember me on this computer checkbox
    Then verify that remember me on this computer checkbox is selected




