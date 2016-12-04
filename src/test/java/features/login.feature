Feature: Login to application
  
  This feature deals with the login functionality of the application

  Scenario: Login with valid username and password
    Given I navigate to the login page
    And I enter the username as admin and password as adminpassword
      | username | password      |
      | admin    | adminpassword |
    And I click login button
    Then I should see the userform page

  Scenario: Login with valid username and password to fail
    Given I navigate to the login page
    And I enter the username as admin and password as adminpassword
      | username | password      |
      | admin    | adminpassword |
    And I click login button
    Then I should notsee the userform page
