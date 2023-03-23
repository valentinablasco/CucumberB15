package com.google.stepdefinitions;

import com.google.pages.WebOrderLoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class WebOrderLoginStepDef {

    WebDriver driver= DriverHelper.getDriver();
    WebOrderLoginPage webOrderLoginPage=new WebOrderLoginPage(driver);

    @When("User provide {string} and {string} for WebOrder")
    public void user_provide_and_for_web_order(String username, String password) {
      webOrderLoginPage.webOrderLogin(username,password);

    }
    @Then("User validate the {string} from homepage")
    public void user_validate_the_from_homepage(String title) {
        Assert.assertEquals(title,driver.getTitle().trim());


    }

    }


