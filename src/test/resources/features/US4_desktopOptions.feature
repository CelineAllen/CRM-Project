@desktopOptions @regression
Feature: As a user, I should be able to see desktop options to download.
  1. There should be 3 options for the desktop version:
  - MAC OS
  - WINDOWS
  - LINUX

  Background: User is on the home page
    Given user is on the home page

  Scenario: Verify that user can see 3 different desktop options on the home page.
    Then verify that below desktop options are displayed
      | Mac OS  |
      | Windows |
      | Linux   |