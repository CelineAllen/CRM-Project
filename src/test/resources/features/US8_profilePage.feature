#US:As a user, I want to access my profile page
#AC:1. Five options should be displayed under the user profile:
#General
#Drive
#Tasks
#Calendar
#Conversation

@myProfile
  Feature: Accessing profile page
Background: User is on the login page
Given user is on the login page
Then the user logged in with username as "helpdesk67@cybertekschool.com" and password as "UserUser"


    Scenario: Verify user should be able to see 5 options on my profile page
      Given user clicks on the profile module on the right side of page
      And user click the my profile option
      Then user can see options displayed on the my profile page
        | General       |
        | Drive         |
        | Tasks         |
        | Calendar      |
        | Conversations |