@moreTab @regression
Feature: As a user, I should be able to see all the options under the MORE tab on the homepage.
  1. Verify the users view all options under the MORE tab
  Verify the users see 4 options:
  File
  Appreciation
  Announcement
  Workflow

  Background: User is on the home page
    Given user is on the home page

  Scenario: Verify that user can see 4 different options under the More tab.
    Then verify that below more tab options are displayed
      | File         |
      | Appreciation |
      | Announcement |
      | Workflow     |
