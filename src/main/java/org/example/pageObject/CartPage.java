package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    public static WebDriver driver;

    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement addToCart;
    public void addProduct(){
        addToCart.click();
    }

    @FindBy(xpath = "//div[@id='shopping_cart_container']/a[1]")
    private WebElement cartIcon;
    public void cart(){
        cartIcon.click();
    }

    @FindBy(xpath = "//div[@class='cart_item']")
    private WebElement productAdded;
    public boolean productList(){
        return productAdded.isDisplayed();
    }
}
