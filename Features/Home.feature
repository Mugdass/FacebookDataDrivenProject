@smoke
Feature: Create Facebook account with data-driven input

  Scenario: Fill create account form from Excel by key
    Given the browser is open on Facebook
    When I open the Create Account dialog
    And I fill the form with excel key "row1"
    Then the form fields should be populated
