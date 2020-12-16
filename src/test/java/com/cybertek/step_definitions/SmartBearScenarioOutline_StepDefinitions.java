package com.cybertek.step_definitions;

import com.cybertek.pages.SmartBearScenarioOutlinePage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.messages.Messages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearScenarioOutline_StepDefinitions {

    SmartBearScenarioOutlinePage smartBearScenarioOutlinePage = new SmartBearScenarioOutlinePage();
    @Given("User is on the SmartBear log in page")
    public void userIsOnTheSmartBearLogInPage() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2ftestcomplete12%2fweborders%2fProcess.aspx");
    }

    @Then("User is logs into SmartBear log in account")
    public void userIsLogsIntoSmartBearLogInAccount() throws InterruptedException {
smartBearScenarioOutlinePage.UserName.sendKeys("Tester");
smartBearScenarioOutlinePage.PassWord.sendKeys("test");
Thread.sleep(3000);
smartBearScenarioOutlinePage.LoginButton.click();
    }

    @Then("User is on the order page")
    public void userIsOnTheOrderPage() throws InterruptedException {
        Thread.sleep(3000);
     smartBearScenarioOutlinePage.OrderPage.click();

    }

    @Then("User selects {string} from the product dropDown")
    public void userSelectsFromTheProductDropDown(String product) throws InterruptedException {
        Select ProductDropDown = new Select(Driver.getDriver().findElement(By.xpath("//select")));
        ProductDropDown.selectByVisibleText(product);
        Thread.sleep(3000);    }

    @Then("User enters {string} to quantity")
    public void userEntersToQuantity(String quantity) throws InterruptedException {
        smartBearScenarioOutlinePage.Quantity.clear();
        Thread.sleep(3000);
        smartBearScenarioOutlinePage.Quantity.sendKeys(quantity);
    }

    @Then("User enters {string} to customer name")
    public void userEntersToCustomerName(String CustomerName) {

        smartBearScenarioOutlinePage.CustomerName.sendKeys(CustomerName);
        Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Then("User enters {string} to street")
    public void userEntersToStreet(String Street) throws InterruptedException {
        smartBearScenarioOutlinePage.Street.sendKeys(Street);
        Thread.sleep(3000);    }

    @Then("User enters {string} to city")
    public void userEntersToCity(String City) throws InterruptedException {
        smartBearScenarioOutlinePage.City.sendKeys(City);
        Thread.sleep(3000);    }

    @Then("User enters {string} to state")
    public void userEntersToState(String State) throws InterruptedException {
        smartBearScenarioOutlinePage.State.sendKeys(State);
        Thread.sleep(3000);
    }

    @Then("User enters {string} to zip")
    public void userEntersToZip(String Zip) throws InterruptedException {
     smartBearScenarioOutlinePage.Zip.sendKeys(Zip);
        Thread.sleep(3000);    }

    @Then("User select {string} as card type")
    public void userSelectAsCardType(String CardType) throws InterruptedException {
        smartBearScenarioOutlinePage.CardType.click();
        Thread.sleep(3000);    }

    @Then("User enters {string} to card number")
    public void userEntersToCardNumber(String CardNumber) throws InterruptedException {
        smartBearScenarioOutlinePage.cardNr.sendKeys(CardNumber);
        Thread.sleep(3000);    }

    @Then("User enters {string} to expiration date")
    public void userEntersToExpirationDate(String ExpirationDate) throws InterruptedException {
        smartBearScenarioOutlinePage.ExpirationDate.sendKeys(ExpirationDate);
        Thread.sleep(3000);    }

    @Then("User clicks process button")
    public void userClicksProcessButton() throws InterruptedException {
        smartBearScenarioOutlinePage.ProcessButton.click();
        Thread.sleep(3000);    }

    @Then("User verifies {string} is in the list")
    public void userVerifiesIsInTheList(String CustomerName) {
        Assert.assertTrue("Customer is not in the list",CustomerName.contains("Ken Adams"));


    }



}
