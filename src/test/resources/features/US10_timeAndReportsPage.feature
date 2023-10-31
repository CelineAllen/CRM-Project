#US:As a user, I want to access the Time and Reports page.
#AC:Verify the users view all modules in the Time and Reports page.
#Absence Chart
#Worktime
#Bitrix24.Time
#Work Reports
#Meetings and Briefings


@timeAndReports
Feature: Accessing Time and Reports page
  Background: User is on the login page
    Given user is on the login page
    Then the user logged in with username as "marketing44@cybertekschool.com" and password as "UserUser"

  Scenario: Verify user can access the "Time and Reports" page
    When the user clicks on the Time and Reports module
    Then the users see sub-modules below
      | Absence Chart          |
      | Worktime               |
      | Bitrix24.Time          |
      | Work Reports           |
      | Meetings and Briefings |