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

    /*      Verify Cart Page        */
    @FindBy(xpath = "//div[@class='cart_list']")
    private WebElement verifyCart;
    public boolean verifyCartPage(){
        return verifyCart.isDisplayed();
    }



    /*      Adding Product Item to Cart on Homepage         */
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement addToCart;
    public void addProduct(){
        addToCart.click();
    }


    /*      Cart Icon       */
    @FindBy(xpath = "//div[@id='shopping_cart_container']/a[1]")
    private WebElement cartIcon;
    public void cart(){
        cartIcon.click();
    }


    /* Add and Remove product item on Cart Page */
    @FindBy(xpath = "//div[@class='cart_item']")
    private WebElement productAdded;
    public boolean verifyProductList(){
        return productAdded.isDisplayed();
    }

    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
    private WebElement removeProduct;
    public void removeProduct(){
        removeProduct.click();
    }

    @FindBy(className = "removed_cart_item")
    private WebElement verifyRemove;
    public boolean verifyRemoveProd(){
        return verifyRemove.isDisplayed();
    }


    /*      Continue Shopping Button       */
    @FindBy(xpath = "//button[@id='continue-shopping']")
    private WebElement contShopBtn;
    public void continueShopBtn(){
        contShopBtn.click();
    }

}
