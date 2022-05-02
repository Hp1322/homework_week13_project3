package com.herokuapp.internet_the.testsuite;

import com.herokuapp.internet_the.pages.Login;
import com.herokuapp.internet_the.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    Login login = new Login();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        login.enterUserName("tomsmith");
        login.enterPassField("SuperSecretPassword!");
        login.clickOnLoginButton();
        Assert.assertEquals(login.getSecureText(), "Secure Area", "Not navigate to page");
    }
    @Test
    public void verifyTheUsernameErrorMessage(){
        login.enterUserName("tomsmith1");
        login.enterPassField("password");
        login.clickOnLoginButton();
        Assert.assertEquals(login.getErrorMessage(), "Your username is invalid!\n" +
                "×", "Not navigate to page");
    }
    @Test
    public void verifyThePasswordErrorMessage(){
        login.enterUserName("tomsmith");
        login.enterPassField("SuperSecretPassword");
        login.clickOnLoginButton();
        Assert.assertEquals(login.getErrorMessage(), "Your password is invalid!\n" +
                "×", "Not navigate to page");
    }
}

