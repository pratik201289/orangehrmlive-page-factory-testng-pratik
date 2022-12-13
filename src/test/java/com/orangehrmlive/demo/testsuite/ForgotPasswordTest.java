package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.ForgotPassword;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ForgotPasswordTest extends BaseTest {

    ForgotPassword forgotPassword;

    @BeforeMethod(alwaysRun = true)
    public void inIT() {

        forgotPassword = new ForgotPassword();
    }

    @Test(groups = {"sanity","regression"})
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {

        forgotPassword.clickOnForgotPasswordLink();
        Assert.assertEquals(forgotPassword.verifyActualTextResetPassword(), "Reset Password", "Reset Password not displayed");

    }
}
