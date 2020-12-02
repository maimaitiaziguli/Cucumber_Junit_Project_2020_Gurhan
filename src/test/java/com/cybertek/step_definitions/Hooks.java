package com.cybertek.step_definitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
 public void setUpScenario (){
        System.out.println("------> Before annotation setting up browser");
 }


 @Before("@db")
 public void setUpDatabaseConnection(){

     System.out.println("------> Data base connection is created <------");
 }

 @After(order = 2)
    public void tearDownScenario (){
     System.out.println("------> After annotation : closing browser");
 }

 @After(value = "@db", order = 1)
    public void tearDownDatabaseConnection(){

     System.out.println("------> AFTER ANNOTATION: DB CONNECTION IS CLOSED <-------");

 }


}
