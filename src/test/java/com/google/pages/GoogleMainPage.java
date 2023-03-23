package com.google.pages;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class GoogleMainPage {

    public GoogleMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@title='Search']")
    WebElement searchBar;

    @FindBy(xpath = "//a//h3")
    List<WebElement> allLinks;


    @FindBy(xpath = "//div[@id='result-stats']")
    WebElement resultMessage;

    @FindBy(xpath = "//div[@id='result-stats']//nobr")
    WebElement searchTiming;




    public void validateHappySearch(String text) {
        searchBar.sendKeys(text, Keys.ENTER);
    }
    public boolean validateNumberOfLinks(int number){
        return (allLinks.size()>number);}
    public boolean validateResultFromSearch(int number){
      String[] result=BrowserUtils.getText(resultMessage).split("");
      return  Double.parseDouble(result[1].replace(",",""))>number;


    }
    public boolean validateSearchingTime(){
        String[] time=BrowserUtils.getText(searchTiming).split(" ");
        return Double.parseDouble(time[0].substring(1))<1.0;
    }





}
