package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public static WebDriver driver;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement userName;
    public void setUserName(String Uname){
        userName.sendKeys(Uname);
    }

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;
    public void setPassword(String password){
        this.password.sendKeys(password);
    }

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement buttonLogin;
    public void btnLogin(){
        buttonLogin.click();
    }
    public boolean verifyLoginPage(){
        return buttonLogin.isDisplayed();
    }

    @FindBy(xpath = "//div[@class='inventory_container']")
    private WebElement productList;
    public boolean verifyHomePage(){
        return productList.isDisplayed();
    }

}
