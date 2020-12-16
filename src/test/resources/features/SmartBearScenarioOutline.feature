Feature: Smart bear order process

  @SmartBearScenarioOutline
  Scenario Outline:  Practice

    Given User is on the SmartBear log in page
    Then User is logs into SmartBear log in account
    Then User is on the order page
    Then User selects "<product>" from the product dropDown
    Then User enters "<quantity>" to quantity
    Then User enters "<customer name>" to customer name
    Then  User enters "<street>" to street
    Then User enters "<city>" to city
    Then User enters "<state>" to state
    Then User enters "<zip>" to zip
    Then User select "<cardType>" as card type
    Then User enters "<card number>" to card number
    Then User enters "<expiration date>" to expiration date
    Then User clicks process button
    Then User verifies "costumer name" is in the list


    Examples: Pass the following table in Scenario Outline
    |product|quantity|customer name|street|city|state|zip|cardType|card number|expiration date|
    |MyMoney|1|Ken Adems|Kinzie st|Chicago|IL|60004|Visa|313313133315|11/22|
    |FamilyAlbum|4|Joey Tribbiani|State st|Chicago|IL|60656|Visa|123433533336|11/22|
    |ScreenSaver|5|Rachel Green|Michigan st|Chicago|IL|60056|Visa|335333333337|10/22|
    |MyMoney|5|Chandler Bing|Erie st|Chicago|IL|60666|Visa|433353333338|10/22|
    |FamilyAlbum|9|Dr DrakeRamoray|Dale st|Arl Hgths|IL|60452|Visa|532333335334|10/22|
    |ScreenSaver|10|Monica Geller|Euclid Ave|Arl Hgths|Il|60312|Visa|733533333333|10/22|
    |MyMoney|3|Rose Geller|River rd|Des Plaines|IL|60666|Visa|833435363732|10/22|
    |MyMoney|1|Ken Adams|Kinzie st|Chicago|IL|60312|Visa|933533333531|12/22|







