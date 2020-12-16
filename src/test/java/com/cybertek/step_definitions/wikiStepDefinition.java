package com.cybertek.step_definitions;

import com.cybertek.pages.WikiSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class wikiStepDefinition {


    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("User is on the Wikipedia home page")
    public void user_is_on_the_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org");
    }


    @When("User searches {string} in the wiki search page")
    public void userSearchesInTheWikiSearchPage(String searchValue) {
        wikiSearchPage.searchBox.sendKeys(searchValue + Keys.ENTER);

    }

    @Then("User should see {string} in the wiki title")
    public void userShouldSeeInTheWikiTitle(String expectedTitle) {
       String actualTitle = Driver.getDriver().getTitle();
       Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    @Then("User should see {string} in the main header")
    public void userShouldSeeInTheMainHeader(String expectedMainHeader) {
        String actualMainHeader = wikiSearchPage.mainHeader.getText();
        Assert.assertEquals(actualMainHeader,expectedMainHeader);
    }

    @Then("User should see {string} in the image header")
    public void userShouldSeeInTheImageHeader(String expectedImageHeader) {
        String actualImageHeader = wikiSearchPage.imageHeaderAfterSearch.getText();
        Assert.assertEquals(actualImageHeader,expectedImageHeader);
    }
}
