Feature: As a user, I should be able to refer product to a friend

  @refer
  Scenario: I should be able to refer Apple MacBook Pro - 13 inch to a friend
    Given I am a registered user of NopCommerce
    When I click on MacBookPage
    Then I click on email a friend button
    Then I should be able to enter mail details
    And click on the submit button
    Then I should be able to see the success message of email sent