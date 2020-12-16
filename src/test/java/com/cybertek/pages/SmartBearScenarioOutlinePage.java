package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.cert.X509Certificate;
import java.util.List;

public class SmartBearScenarioOutlinePage {


    public SmartBearScenarioOutlinePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@name=\"ctl00$MainContent$username\"]")
    public WebElement UserName;

    @FindBy(xpath = "//input[@name=\"ctl00$MainContent$password\"]")
    public WebElement PassWord;

    @FindBy(xpath = "//input[@value=\"Login\"]")
    public WebElement LoginButton;


    @FindBy(xpath = "//*[@id=\"ctl00_menu\"]/li[3]/a")
    public WebElement OrderPage;

    @FindBy(xpath = "//select")
    public List<WebElement> Product;

    @FindBy(xpath = "//input[@onchange=\"productsChanged()\"]")
    public WebElement Quantity;

    @FindBy(xpath = "//input[@name=\"ctl00$MainContent$fmwOrder$txtName\"]")
    public WebElement CustomerName;

    @FindBy(xpath = "//input[@name=\"ctl00$MainContent$fmwOrder$TextBox2\"]")
    public WebElement Street;

    @FindBy(xpath = "//input[@name=\"ctl00$MainContent$fmwOrder$TextBox3\"]")
    public WebElement City;

    @FindBy(xpath = "//input[@name=\"ctl00$MainContent$fmwOrder$TextBox4\"]")
    public WebElement State;

    @FindBy(xpath ="//input[@name=\"ctl00$MainContent$fmwOrder$TextBox5\"]" )
    public WebElement Zip;

    @FindBy(xpath = "//input[@id=\"ctl00_MainContent_fmwOrder_cardList_0\"]")
    public WebElement CardType;

    @FindBy(xpath = "//input[@name=\"ctl00$MainContent$fmwOrder$TextBox6\"]")
    public WebElement cardNr;

    @FindBy(xpath = "//input[@name=\"ctl00$MainContent$fmwOrder$TextBox1\"]")
    public WebElement ExpirationDate;

    @FindBy(xpath = "//a[@class=\"btn_light\"]")
    public WebElement ProcessButton;







}
