package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.*;
import org.apache.commons.logging.Log;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class LoginFailed {
    public LoginFailed(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
LoginPage loginPage = new LoginPage();
    @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String string1, String string2) {
    loginPage.inputUsername.sendKeys(string1);
    loginPage.inputPassword.sendKeys(string2);
    BrowserUtils.clickElement(loginPage.LoginBtn);
    }
    @Then("{string} message should be displayed")
    public void message_should_be_displayed(String string) {
        Assert.assertEquals("Wrong username or password.", loginPage.wrongUserAndPasswordMsg.getText());

    }



}
