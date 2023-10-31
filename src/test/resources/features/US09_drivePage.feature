#US:As a user, I want to access the Drive page
#AC:Verify the users view all modules in the Drive page.
#My Drive
#All Documents
#Company Drive
#Sales and Marketing
#Top Management's documents
#Drive Cleanup


@drive
Feature: Accessing Driver Page

  Background: User is on the login page
    Given user is on the login page
    Then the user logged in with username as "helpdesk18@cybertekschool.com" and password as "UserUser"


  Scenario: Verify the user can see all modules in the Drive page
    When User clicks on the drive
    Then user can see all buttons on the drive page
      | My Drive                   |
      | All Documents              |
      | Company Drive              |
      | Sales and Marketing        |
      | Top Management's documents |
      | Drive Cleanup              |
      | More                       |

