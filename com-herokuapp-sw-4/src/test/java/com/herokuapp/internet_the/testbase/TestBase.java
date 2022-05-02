package com.herokuapp.internet_the.testbase;

import com.herokuapp.internet_the.propertyreader.PropertyReader;
import com.herokuapp.internet_the.utility.Utility;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterClass
    public void tearDown(){
        closeBrowser();
    }
}
