@userProfile @regression
Feature: As a user, I should be able to see all the options under the user profile.
  1. Five options should be displayed under the user profile:
  My Profile
  Edit Profile Settings
  Themes
  Configure notifications
  Log out

  Background: User is on the home page
    Given user is on the home page

  Scenario: Verify that user can see 5 different options under the user profile.
    Then verify that below user profile options are displayed
      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Log out                 |