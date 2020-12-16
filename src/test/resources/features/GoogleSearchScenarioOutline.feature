Feature: Search
  Agile story: As a user, I should be able to search when I am on the Google search page.

  @scenarioOutline
  Scenario Outline: Google title verification after search
    Given User is on the google search page

    When User search "<searchValue>"
    Then User should see "<expectedTitlee>" in the title

    Examples: Search values I want to search in Google

      | searchValue | expectedTitlee |
      | apple       | applee          |
      | kiwi        | kiwi           |
      | orange      | orange         |
      | mango       | mango         |

    #making table pretty press command + option + enter









