@chatAndCalls @regression
Feature: As a user, I should be able to access the Chat and Calls module.
  1. There should be four sub-modules once the user clicks the Chat and Calls module:
  Message(s)
  Notifications
  Settings
  Activity Stream


  Background: User is on the home page
    Given user is on the home page

  Scenario: Verify that user can see 4 different options under the Chat and Calls module.
    Then verify that below chat and calls module options are displayed
      | Message(s)    |
      | Notifications |
      | Settings      |
      | Activity Stream |