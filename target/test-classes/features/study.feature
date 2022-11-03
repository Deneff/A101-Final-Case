Feature: Case Study Tests

  Background:
    Given homepage is open

    Scenario: Add product to basket with login
      When I login with facebook
      Then I verify logged in on hb homepage
      And I search with "bilgisayar"
      Then I go to any product detail page
      And I add basket product with two different seller
      Then I verify product on basket page
