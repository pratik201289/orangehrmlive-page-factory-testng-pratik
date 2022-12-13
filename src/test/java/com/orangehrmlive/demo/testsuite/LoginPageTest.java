package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginPageTest extends BaseTest {

    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIT() {
        loginPage = new LoginPage();
    }
    @Test(groups = {"sanity","regression"})
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        loginPage.setUserName("Admin");
        loginPage.setPassword("admin123");
        loginPage.setClickLoginButton();

        Assert.assertEquals(loginPage.getSuccessMessage(), "Dashboard", "Success Message not displayed");

    }
}
