package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage=new LoginPage();


    @Test
    public void verifyUserCanLoginSuccessfullyWithSuccessfully(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        Assert.assertEquals(loginPage.verifyMessage(),"PRODUCTS","User is unable to login");
    }
@Test
    public void verifyThatsixProductDisplayedOnPage(){
    loginPage.enterUserName("standard_user");
    loginPage.enterPassword("secret_sauce");
    loginPage.clickOnLoginButton();
    Assert.assertEquals(loginPage.verifyListOfItemOnScreen(),6,"not equal");
}


}
