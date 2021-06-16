Feature: Amazon create account

  @AmazonCreateAccount
  Scenario: User creates account in Amazon
    Given User sign in to Amazon webpage
    When User enters the credentials
    And User clicks to create account button
    Then Action requires page will open