package com.cybertek.step_definitions;

import com.cybertek.pages.EtsySearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsyStepDefinition {
    EtsySearchPage etsySearchPage = new EtsySearchPage();

    @When("User is on Etsy home page")
    public void user_is_on_etsy_home_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get("https://www.etsy.com");

    }

    @Then("User should see the title as expected.")
    public void user_should_see_the_title_as_expected() {
        // Write code here that turns the phrase above into concrete actions
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        Assert.assertEquals(actualTitle,expectedTitle);
    }


    @When("User search {string} in the search box")
    public void userSearchInTheSearchBox(String searchValue) {
      etsySearchPage.searchBox.sendKeys( searchValue);
    }

    @And("User clicks the search button")
    public void userClicksTheSearchButton() {
        etsySearchPage.searchButton.click();
    }

    @Then("User should see {string} is in the Etsy title")
    public void userShouldSeeIsInTheEtsyTitle(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
}
