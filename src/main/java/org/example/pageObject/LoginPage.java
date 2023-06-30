package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

    public static WebDriver webDriver;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }



    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement userName;
    public void setUserName(String userName){
        this.userName.sendKeys(userName);
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

    @FindBy(css = "h3")
    private WebElement errText;
    public String errorText(){
        return errText.getText();
    }





}
