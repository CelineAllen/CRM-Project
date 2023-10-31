#US: As a user, I want to access the Employees page
#AC:Verify the users view all modules in the T Employees page.
#Company Structure
#Find Employee
#Telephone Directory
#Staff Changes
#Efficiency report
#Honored Employees
#Birthdays
#New page


@employees
Feature: Accessing Employees page


  Background: User is on the login page
    Given user is on the login page
    Then the user logged in with username as "marketing48@cybertekschool.com" and password as "UserUser"


  Scenario: Verify users can click on Employees page on the left column and access Employees page
    When the user clicks on "Employees" module on the left hand side
    Then the user sees modules below on the page
      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | More                |
      | Honored Employees   |
      | ,                   |



#    TODO actual modules are different fix AC or the list above



