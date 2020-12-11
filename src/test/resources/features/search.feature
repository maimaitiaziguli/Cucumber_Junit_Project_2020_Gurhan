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


    @googleTable
  Scenario: Google search page footer links verification
    Then User should see six links in the footer
      | Advertising      |
      | Business         |
      | How Search Works |
      | Privacy          |
      | Terms            |
      | Settings         |

       #command + option + L
       #contrl + alt + L

