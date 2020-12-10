@etsyAll
Feature: Etsy search  feature
Agile story: User should be able to enter search terms and see relevant
  results in the page and in the title
Background:
  When User is on Etsy home page




  Scenario: Title verification
    Then User should see the title as expected.
    # expected : Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone
  # Follow POM
  @etsyWip
Scenario: Title verification after search term
  When User search "wooden spoon" in the search box
  And User clicks the search button
  Then User should see "Wooden spoon" is in the Etsy title