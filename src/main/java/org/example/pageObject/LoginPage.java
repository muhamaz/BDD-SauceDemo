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

    @FindBy(css = "h3")
    private WebElement errText;
    public String errorText(){
        return errText.getText();
    }

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement filter;
    public void filterProduct(String text){
        Select selectProduct = new Select(filter);
        selectProduct.selectByVisibleText(text);
    }

    @FindBy(css = ".inventory_list > div:nth-of-type(1) .inventory_item_price")
    private WebElement price;
    public String getProdPrice(){
        return price.getText();
    }
    @FindBy(css = ".inventory_list > div:nth-of-type(1) .inventory_item_name")
    private WebElement prodName;
    public String getProdName(){
        return prodName.getText();
    }

}
