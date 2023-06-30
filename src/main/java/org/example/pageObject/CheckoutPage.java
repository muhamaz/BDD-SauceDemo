package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    public static WebDriver webDriver;

    public CheckoutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }


    /*                  Home Page Select Product                    */
//    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
//    private WebElement prodOne;
//    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
//    private WebElement prodTwo;
//    xpath for add to chart button : "//div[text()='"+ namaProduct +"']//ancestor::div[@class='inventory_item']/div[2]/div[2]/button"
    public void addProduct(String prodName){
        //Using variabel on xpath
        webDriver.findElement(By.xpath("//button[contains(@id,'"+prodName+"')]")).click();
//        prodOne.click();
//        prodTwo.click();
    }

    /*          Removing one product on cart page           */
    @FindBy(xpath = "//button[@id='remove-sauce-labs-onesie']")
    private WebElement removeProdOne;
    public void removeOne(){
        removeProdOne.click();
    }


    /*              Checkout button on cart page            */
    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkoutBtn;
    public void clickCheckout(){
        checkoutBtn.click();
    }
    public boolean verifyCheckoutBtn(){
        return checkoutBtn.isDisplayed();
    }


    /*                  Checkout page Form Field                    */
    @FindBy(xpath = "//div[@id='checkout_info_container']")
    private WebElement checkoutPage;
    public boolean verifyCheckoutPage(){
        return checkoutPage.isDisplayed();
    }

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;
    public void setFirstName(String firstName){
        this.firstName.sendKeys(firstName);
    }

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;
    public void setLastName(String lastName){
        this.lastName.sendKeys(lastName);
    }

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCode;
    public void setPostalCode(int postalCode){
        this.postalCode.sendKeys(String.valueOf(postalCode));
    }

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueBtn;
    public void clickContinue(){
        continueBtn.click();
    }

    @FindBy(xpath = "//button[@id='cancel']")
    private WebElement cancelBtn;
    public void clickCancelBtn(){
        cancelBtn.click();
    }

    /*                  End of Checkout Form Field                    */


    /*                      Checkout Summary page                       */
    @FindBy(xpath = "//div[@id='checkout_summary_container']")
    private WebElement checkoutSum;
    public boolean verifyCheckoutSum(){
        return checkoutSum.isDisplayed();
    }

    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement totalPrice;
    public String getTotalPrice(){
        return totalPrice.getText();
    }

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishBtn;
    public void clickFinishBtn(){
        finishBtn.click();
    }
    /*                  End of Checkout Summary                 */



    /*                  Checkout Complete page                  */
    @FindBy(xpath = "//button[@id='back-to-products']")
    private WebElement backHomeBtn;
    public void clickBackBtn(){
        backHomeBtn.click();
    }


}
