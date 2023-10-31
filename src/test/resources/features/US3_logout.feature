@Logout @regression
Feature: As a user, I should be able to logout.
  1. The "Log out" option should be displayed when the user clicks the user profile from the homepage then the user should navigate back to the login page.

  Background: User is on the home page
    Given user is on the home page

  Scenario: Verify that user can logout.
    When user clicks on user profile
    Then verify that log out option is displayed
    And user clicks on log out option
    Then verify that user navigate back to login page
