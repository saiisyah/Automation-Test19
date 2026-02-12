@Login

Feature: Login

  @valid-login
  Scenario: Login using valid email or username and password
    Given user already on the login page
    And user input email or username "standard_user"
    And user input password "secret_sauce"
    When user clicked login button
    Then user successfully on home page

  @invalid-login
  Scenario: Login using invalid email or username and password
    Given user already on the login page
    And user input email or username "standard_user"
    And user input password "secret_sauceeeee"
    When user clicked login button
    Then user cannot logged in to Dashboard
    And user see error message "Epic sadface: Username and password do not match any user in this service"


   @invalid-username
   Scenario: Login using invalid email or username
     Given user already on the login page
     And user input invalid username "satuditambahsatusamadenganduaduaditambahduasamadengantigatigaditambahtigasamadenganempat"
     And user input password "secret_sauce"
     When user clicked login button
     Then user cannot logged in because "invalid username"
     And user see error message "Epic sadface"
