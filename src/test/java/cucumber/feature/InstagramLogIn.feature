Feature: As a user I want to be able to log in into the instagram web site

  Scenario Outline: Sign in user
    Given user is on home page
    When user navigates to the sign in page
    And user provides the login as <login>
    And user provides the password as <password>
    And user clicks sign in button
    And user reloads page
    Then user should be logged in to the web site
    Examples:
      | login                  | password |
      | javalogging@gmail.com  | Ta123456 |