#US:As a user, I should be able to access to the Company page
#AC:Verify users see the 7 modules in the Company page shown as design
#Official information
#Our Life
#About Company
#Photo Gallery
#Video
#Career
#Business News(RSS)


  @companyPage
  Feature:Accessing company page
    Background: User is on the login page
      Given user is on the login page
      Then the user logged in with username as "marketing36@cybertekschool.com" and password as "UserUser"



    Scenario: user should be able to access the Company page
      When user goes to the company page
      Then user sees the seven module in the page
        | Official Information |
        | Our Life             |
        | About Company        |
        | Photo Gallery        |
        | Video                |
        | Career               |
        | Business News (RSS)  |
        | More                 |