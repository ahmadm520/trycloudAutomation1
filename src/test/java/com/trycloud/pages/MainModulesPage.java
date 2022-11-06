package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainModulesPage {

    public MainModulesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@id='user']")
    public WebElement inputUsername;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement inputPassword;

    @FindBy (xpath = "//input[@id='submit-form']")
    public WebElement loginBtn;

    @FindBy (xpath = "//a[@aria-label='Dashboard']")
    public WebElement dashboard;

    @FindBy (xpath = "//a[@aria-label='Files']")
    public WebElement files;

    @FindBy (xpath = "//a[@aria-label='Photos']")
    public WebElement photos;

    @FindBy (xpath = "//a[@aria-label='Activity']")
    public WebElement activity;

    @FindBy (xpath = "//a[@aria-label='Talk']")
    public WebElement talk;

    @FindBy (xpath = "//a[@aria-label='Contacts']")
    public WebElement contacts;

    @FindBy (xpath = "//a[@aria-label='Circles']")
    public WebElement circles;

    @FindBy (xpath = "//a[@aria-label='Calendar']")
    public WebElement calendar;

    @FindBy (xpath = "//a[@aria-label='Deck']")
    public WebElement deck;
}
