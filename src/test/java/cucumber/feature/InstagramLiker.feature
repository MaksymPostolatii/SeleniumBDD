Feature: Verify program ability to set 'like' in all photos for requested user

  Scenario Outline: Program sets 'like' in all photos for requested user
    Given user navigates to the <page> page
    And user clicks on the login tab
    And user provides the login as <login>
    And user provides the password as <password>
    And user clicks sign in button
    And user reloads page for avoiding 'download app for mobile' page
    And user is logged in to the web site
    And user types friend name as <name> into the search field
    And user opens friend page and wait for URL with <name> loading
    And user opens first image
    And user sets like for each image and closes last image
    And user clicks on the profile page
    And user opens options page
    And user clicks log out button
    Then user should be logged out from the web site
    Examples:
      | login                 | password | name         | page                             |
      | javalogging@gmail.com | Ta123456 | zbsk.citizen | https://www.instagram.com/?hl=en |