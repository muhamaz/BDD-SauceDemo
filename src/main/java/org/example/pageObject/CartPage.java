package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    public static WebDriver webDriver;

    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement addToCart;
    public void addProduct(){
        addToCart.click();
    }

    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
    private WebElement removeProduct;
    public void removeProduct(){
        removeProduct.click();
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

    @FindBy(className = "removed_cart_item")
    private WebElement verifyRemove;
    public boolean verifyRemoveProd(){
        return verifyRemove.isDisplayed();
    }

}
