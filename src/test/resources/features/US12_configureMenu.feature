#US:As a user, I should be able to configure the menu.
#AC:Verify users can access to 6 options under the CONFIGURE MENU.
#Configure Menu Items
#Collapse menu
#Remove current page from left menu
#Add custom menu item
#Change primary tool
#Reset menu


  @configureMenu
Feature: Verifying configure menu options
Background: User is on the login page
Given user is on the login page
Then the user logged in with username as "marketing84@cybertekschool.com" and password as "UserUser"

Scenario: verify user can see 6 options under configure menu
When user clicks on configure menu button
Then user sees options displayed below
| Configure menu items               |
| Collapse menu                      |
| Remove current page from left menu |
| Add custom menu item               |
| Change primary tool                |
| Reset menu                         |
