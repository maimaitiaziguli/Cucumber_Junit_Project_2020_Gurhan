Feature: Search
  Agile story: As a user, I should be able to search when I am on the Google search page.


  Scenario: Google title verification after search
    Given User is on the google search page
    When User search "broccoli"
    Then User should see "broccoli" in the title



