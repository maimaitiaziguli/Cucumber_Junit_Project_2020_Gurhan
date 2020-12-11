Feature: Wikipedia title verification



  Background:
    Given User is on the Wikipedia home page
    When User searches "Steve Jobs" in the wiki search box


  @wiki
  Scenario: Wiki search functionality title verification

    Then User should sees "Steve Jobs" in the wiki tile

@wiki2
    Scenario: Search functionality header verification
      Then User should see "Steve Jobs" in the main header