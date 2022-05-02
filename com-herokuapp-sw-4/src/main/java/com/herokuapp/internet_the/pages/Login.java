package com.herokuapp.internet_the.pages;

import com.herokuapp.internet_the.utility.Utility;
import org.openqa.selenium.By;

public class Login extends Utility {
    By userName = By.id("username");
    By passField = By.name("password");
    By logInButton = By.xpath("//i[contains(text(),'Login')]");
    By secureText = By.xpath("//body/div[2]/div[1]/div[1]/h2[1]");
    By errorMessage = By.xpath("//div[@id='flash']");

    public void enterUserName(String user){
        sendTextToElement(userName, user);
    }
    public void enterPassField(String pass){
        sendTextToElement(passField, pass);
    }
    public void clickOnLoginButton(){
        clickOnElement(logInButton);
    }
    public String getSecureText(){
        return getTextFromElement(secureText);
    }
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }
}
