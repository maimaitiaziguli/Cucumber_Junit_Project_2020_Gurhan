Feature: Search
  Agile story: As a user, on the Google search page user should be able to see the title Google


  Background:  User should be on the google search page
    Given User is on the search page

  Scenario: Google default title verification
    Then User should see the title is google

    @wip  #work in progress
    Scenario: Google title verification after search
      When User search apple
      Then User should see apple in the title