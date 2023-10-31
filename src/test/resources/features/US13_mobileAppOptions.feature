#US:As a user, I want to see mobile app options to download
#AC:Verify users can see mobile app options
#APP STORE
#GOOGLE PLAY

@mobileApp
Feature: Verifying to see mobile app options on homepage
  Background: User is on the login page
    Given user is on the login page
    Then the user logged in with username as "helpdesk27@cybertekschool.com" and password as "UserUser"

    Scenario:verify user can see mobile app options
      When user scrolls down to Mobile Applications
      Then  user sees mobile app options displayed below
        | APP STORE   |
        | GOOGLE PLAY |