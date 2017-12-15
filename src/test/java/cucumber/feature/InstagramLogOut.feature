Feature: As a user I want to be able to log out from the instagram web site

  Scenario: Log out user
    Given user successfully logged in
    When user navigates to the profile page
    And user opens options page
    And user clicks log out button
    Then user should be logged out from the web site
