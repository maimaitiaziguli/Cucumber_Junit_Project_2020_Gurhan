package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class GoogleStepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();



    @Given("User is on the search page")
    public void user_is_on_the_search_page() {
        // Write code here that turns the phrase above into concrete actions
        //System.out.println("USER IS ON THE GOOGLE SEARCH PAGE");

        Driver.getDriver().get("https://www.google.com");

    }




    @Then("User should see the title is google")
    public void user_should_see_the_title_is_google() {
        // Write code here that turns the phrase above into concrete actions
        //System.out.println("USER SEES THE TITLE IS GOOGLE");

       String actualTitle = Driver.getDriver().getTitle();
       String expectedTitle = "Google";

        //Assert.assertEquals(expectedTitle,actualTitle);

       // Assert.assertTrue("Actual title does not match expected title",actualTitle.equals(expectedTitle));
        Assert.assertEquals("Actual title does not match expected title",actualTitle,expectedTitle);
    }


    @When("User search apple")
    public void userSearchApple() {
    }

    @Then("User should see apple in the title")
    public void userShouldSeeAppleInTheTitle() {
    }



    @Then("User should see six links in the footer")
    public void user_should_see_six_links_in_the_footer(List<String> linkStrings) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.





int expectedSize = linkStrings.size();
int actualSize = googleSearchPage.footerLinks.size();

 System.out.println("linkStrings.size() = " + linkStrings.size());
        System.out.println("linkStrings:" + linkStrings);

Assert.assertEquals(actualSize,expectedSize);

    }



}
