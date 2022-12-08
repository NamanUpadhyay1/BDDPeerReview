Feature: As a user, I should be able to register in order to use all the account accessibility

  @register
  Scenario: I should be able to register with valid credentials

    Given I am on registrationpage
    When I enter account details
    Then I should be able to register an account successfully