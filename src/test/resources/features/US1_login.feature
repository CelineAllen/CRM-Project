  @login @regression
  Feature: As a user, I should be able to log in to the with valid credentials.
    1. Verify login with valid credentials
    2. "Incorrect login or password" should be displayed when a user enters the wrong username or password.

  Background: User is on the login page
    Given user is on the login page

  Scenario Outline: Verify login with valid credentials for 3 different user types
    When user enters "valid" "<username>" and "valid" "<password>"
    And user clicks on "Log In" button
    Then verify that right "<username>" is displayed on the profile

    Examples:
      | username                      | password |
      | hr1@cybertekschool.com        | UserUser |
      | helpdesk1@cybertekschool.com  | UserUser |
      | marketing1@cybertekschool.com | UserUser |

  Scenario Outline: "Incorrect login or password" should be displayed when user enters the wrong/no username or password
    When user enters "invalid/no" "<username>" and "invalid/no" "<password>"
    And user clicks on "Log In" button
    Then verify that "Incorrect login or password" error message is displayed

    Examples:
      | username                         | password      |
      | wrongusername@cybertekschool.com | UserUser      |
      | hr1@cybertekschool.com           | wrongpassword |
      |                                  | UserUser      |
      | hr1@cybertekschool.com           |               |
      |                                  |               |

