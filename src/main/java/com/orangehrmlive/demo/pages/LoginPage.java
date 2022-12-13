package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(name = "username")
    WebElement enterUserName;

    @CacheLookup
    @FindBy(name = "password")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(xpath = "//button[@type = 'submit']")
    WebElement clickLoginButton;
    @CacheLookup
    @FindBy(xpath = "//span/h6[text() = 'Dashboard']")
    WebElement getDashboardText;
    public void setUserName(String username){
        Reporter.log("Enter Username " +username+ " to email field "+ enterUserName.toString());
        sendTextToElement(enterUserName,username);
        CustomListeners.test.log(Status.PASS, "Enter Username " + username);
    }

    public void setPassword(String password){
        Reporter.log("Enter Username " +password+ " to email field "+ enterPassword.toString());
        sendTextToElement(enterPassword,password);
        CustomListeners.test.log(Status.PASS, "Enter Username " + password);
    }

    public void setClickLoginButton(){
        Reporter.log("Click on Login Button: "+clickLoginButton.toString());
        clickOnElement(clickLoginButton);
        CustomListeners.test.log(Status.PASS, "Click on Login Button");
    }
    public String getSuccessMessage(){

        Reporter.log("Get Success Message from DashBoard : "+getDashboardText.toString());
        CustomListeners.test.log(Status.PASS, "Click on Login Button");
        return getTextFromElement(getDashboardText);
    }

}
