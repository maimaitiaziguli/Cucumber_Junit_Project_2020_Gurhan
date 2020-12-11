package com.cybertek.step_definitions;

import com.cybertek.pages.WikiSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class WikiStepDefinitions {

WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("User is on the Wikipedia home page")
    public void user_is_on_the_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org");
    }




    @When("User searches {string} in the wiki search box")
    public void user_searches_in_the_wiki_search_box(String string) {
wikiSearchPage.searchBox.sendKeys(string+ Keys.ENTER);

    }
    @Then("User should sees {string} in the wiki tile")
    public void user_should_sees_in_the_wiki_tile(String expectedTitle) {
       String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    @When("User searched {string}in the wiki search page")
    public void userSearchedInTheWikiSearchPage(String string) {
     wikiSearchPage.searchBox.sendKeys(string + Keys.ENTER);

    }

    @Then("User should see {string} in the main header")
    public void userShouldSeeInTheMainHeader(String expectedHeader) {

        String actualHeader = wikiSearchPage.mainHeader.getText();

        Assert.assertEquals("Actual header does not match with ecpected header",actualHeader,expectedHeader );
    }
}
