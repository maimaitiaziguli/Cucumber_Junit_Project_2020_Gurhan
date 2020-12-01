package com.cybertek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LibraryLoginStepDefinition {

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on the long in page");
    }


    @When("User logs in as librarian")
    public void user_logs_in_as_librarian() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User logs in as librarian");
    }
    @Then("User should see the dashboard")
    public void user_should_see_the_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User should be able to see the dashboard");
    }


    @When("User logs in as student")
    public void user_logs_in_as_student() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User logs in as student");
    }

    @When("User logs in as admin")
    public void user_logs_in_as_admin() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User logs in as admin");
    }


}
