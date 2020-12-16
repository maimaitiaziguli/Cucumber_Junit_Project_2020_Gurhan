package com.cybertek.step_definitions;


import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import io.cucumber.messages.Messages;
import io.cucumber.plugin.event.Node;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
 public void setUpScenario (){
        System.out.println("------> Before annotation setting up browser");
 }


 @Before("@db")
 public void setUpDatabaseConnection(){

     System.out.println("------> Data base connection is created <------");
 }



 @After(order = 1)
    public void tearDownScenario (Scenario scenario){
       // System.out.println("------> After annotation : closing browser");
     //System.out.println("scenario.getName() = " + scenario.getName());
     //System.out.println("scenario.getSourceTagNames() = " + scenario.getSourceTagNames());
     //System.out.println("scenario.isFailed() = " + scenario.isFailed());


     //#1 we need to take a screen shot using SELENIUM
     // getScreenShotAs: to be able to use this method we have to cast out
     // driver type to TakeScreenshot type

     if (scenario.isFailed()) {

         byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

         //#2 we are going to attach it into our report: using attach method
         // attach method accepts 3 arguments: #1: screenShot itself, #2 image type, #3 current scenario's name
         scenario.attach(screenShot, "image/png", scenario.getName());
     }





 }




 @After(value = "@db", order = 2)
    public void tearDownDatabaseConnection(){

     System.out.println("------> AFTER ANNOTATION: DB CONNECTION IS CLOSED <-------");

 }

 @BeforeStep
    public void setUpStep(){
     System.out.println("======> BeforeStep Taking screenshot <======== ");
 }



    @AfterStep
    public void tearDownStep(){
        System.out.println("======> AfterStep Taking screenshot <======== ");
    }
}
