package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ModulesPage {
    public ModulesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']/li")
    public List<WebElement> modules1;

    @FindBy(xpath = "//li[@id='more-apps']/preceding-sibling::li")
    public List<WebElement> moduleText;


    public List<String> getTextModule(){
        List<String> getTextModuleArray = new ArrayList<>();
        for(int i = 0; i < modules1.size() -1; i++){
            BrowserUtils.hover(modules1.get(i));
            getTextModuleArray.add(modules1.get(i).getText());

        }return getTextModuleArray;
    }


}