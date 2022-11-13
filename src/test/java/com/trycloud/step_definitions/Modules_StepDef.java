package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.pages.ModulesPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Modules_StepDef {



    @When("user  log in with valid credentials")
    public void user_log_in_with_valid_credentials() {
      new LoginPage().inputUsername.sendKeys(ConfigurationReader.getProperty("username"));
      new LoginPage().inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
      new LoginPage().LoginBtn.click();
    }
    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> expectedModules) {
        BrowserUtils.waitFor(5);
        Assert.assertEquals(expectedModules, new ModulesPage().getTextModule());
    }
}
