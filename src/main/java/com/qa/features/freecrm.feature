Feature: Free CRM Application Test

  Scenario: Validate Free CRM Home Page test
    Given user is opens browser 
    Then user is on login page
    Then user logs in to app
    Then validate home page title
    #Then validate logged in username
