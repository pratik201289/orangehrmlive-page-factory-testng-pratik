package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ForgotPassword extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'orangehrm-login-forgot']/p[text() = 'Forgot your password? ']")
    WebElement clickForgotPasswordLink;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'orangehrm-card-container']/form/h6[text() = 'Reset Password']")
    WebElement actualTextPassword;

public void clickOnForgotPasswordLink(){
    Reporter.log("Click on Forgot Password Link:" + clickForgotPasswordLink.toString());
    clickOnElement(clickForgotPasswordLink);
    CustomListeners.test.log(Status.PASS, "Click on Forgot Password link");

}
public String verifyActualTextResetPassword(){

    Reporter.log("Verify Actual Text of Reset Password Link:" + actualTextPassword.toString());
    CustomListeners.test.log(Status.PASS, "Verify The Text Reset Password");
    return getTextFromElement(actualTextPassword);
}

}
