Feature: Wiki Title Verification

  Background: User is on the wiki home page
    Given User is on Wikipedia home page

  @wiki
  Scenario:Search functionality title verification
    When User searches "Steve Jobs" in the wiki search page
    Then User sees "Steve Jobs" is in the wiki tile
    # Follow POM