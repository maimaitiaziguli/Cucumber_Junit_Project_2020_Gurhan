
Feature: Wikipedia title verification


  Background:
    Given User is on the Wikipedia home page

  @wikiScenarioOutline
  Scenario Outline: Wiki search functionality title verification
    When User searches "<searchValue>" in the wiki search page
    Then User should see "<expectedTitle>" in the wiki title
    Then User should see "<expectedMainHeader>" in the main header
    Then User should see "<expectedImageHeader>" in the image header


    Examples:
      | searchValue     | expectedTitle   | expectedMainHeader | expectedImageHeader |
      | Steve Jobs      | Steve Jobs      | Steve Jobs         | Steve Jobs          |
      | John Travolta   | John Travolta   | John Travolta      | John Travolta       |
      | Albert Einstein | Albert Einstein | Albert Einstein    | Albert Einstein     |
      | Bruce Lee       | Bruce Lee       | Bruce Lee          | Bruce Lee           |
      | Thomas Edison   | Thomas Edison   | Thomas Edison      | Thomas Edison       |
      | Bill Gates      | Bill Gates      | Bill Gates         | Bill Gates          |
