package com.cybertek.step_definitions;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

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
    public void tearDownScenario (){
     System.out.println("------> After annotation : closing browser");
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
