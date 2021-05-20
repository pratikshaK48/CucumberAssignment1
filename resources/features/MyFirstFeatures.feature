Feature: My First Feature

  Scenario: Open Browser and Navigate
    Given User Opened the Browser
    When User Navigated to the app Url
    Then User is able to see application landing app

  Scenario: User is able to Search for a product
    Given User Opened the Browser and User Navigated to the app Url
    When User search for a new product
    Then Search result for the product is displayed