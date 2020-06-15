Feature: Login
  Scenario: Successful login with valid credentials
    Given User at Login Page
    When User fill "diepanh" into input username
    And User fill " 123456" into input password
    And User click on login button
    Then Redirect Dashboard page