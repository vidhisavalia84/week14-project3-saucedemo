package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends Utility {

    By userName = By.id("user-name");
    By password = By.id("password");
    By loginButton = By.id("login-button");
    By actualMessage = By.xpath("//span[contains(text(),'Products')]");
    By listOfItemOnScreen = By.className("inventory_item");

    public void enterUserName(String text) {
        sendTextToElement(userName, text);

    }

    public void enterPassword(String text) {
        sendTextToElement(password, text);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String verifyMessage() {
        return getTextFromElement(actualMessage);
    }

    public int verifyListOfItemOnScreen() {
        List<WebElement> listOfElement=driver.findElements(listOfItemOnScreen);
       return listOfElement.size();
    }
}