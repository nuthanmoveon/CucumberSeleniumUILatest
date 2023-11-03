Feature: Login to the application

  Scenario: Verify user login to the application
    Given User is on the login page
    Then user enters "standard_user" and "secret_sauce"
    And Click on login button
    Then The user should be navigated to the home page having text "Products"
