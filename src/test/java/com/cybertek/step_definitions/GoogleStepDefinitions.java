package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class GoogleStepDefinitions {


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




}
