package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.*;

public class Login_StepDef {

    LoginPage loginPage = new LoginPage();
    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("user enter valid {string} and {string}")
    public void user_enter_valid_and(String string1, String string2) {
    loginPage.inputUsername.sendKeys(string1);
    loginPage.inputPassword.sendKeys(string2);

    }

    @When("user click login button")
    public void user_click_login_button() {
    loginPage.LoginBtn.click();
    }

    @Then("user should be at dashboard page")
    public void user_should_be_at_dashboard_page() {
    Driver.getDriver().getTitle().contains("Dashboard");
    }



}
