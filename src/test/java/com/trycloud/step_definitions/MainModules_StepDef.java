package com.trycloud.step_definitions;

import com.trycloud.pages.MainModulesPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class MainModules_StepDef {


    MainModulesPage mainModulesPage = new MainModulesPage();
    Actions actions = new Actions(Driver.getDriver());






    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("the users  log in with valid credentials")
    public void the_users_log_in_with_valid_credentials() {
    mainModulesPage.inputUsername.sendKeys(ConfigurationReader.getProperty("username"));
    mainModulesPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
    mainModulesPage.loginBtn.click();

    }
    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> list) {


//       actions.moveToElement(mainModulesPage.dashboard).perform();
//       String expectedName = mainModulesPage.dashboard.getText();
//        Assert.assertEquals("Dashboard", expectedName);
    }




}
