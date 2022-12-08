Feature: As a user, I should be able to add comment successfully

  @details
  Scenario: I should be able to add comments tittle and details successfully
    Given I am on the HomePage
    When I click on the details button
    Then I should be able to enter title and comment
    And I should be able to submit it successfully
    And I should be able to see the success Message