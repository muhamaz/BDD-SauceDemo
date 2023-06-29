package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    public static WebDriver driver;

    public CheckoutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }



    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkoutBtn;
    public void clickCheckout(){
        checkoutBtn.click();
    }
    public boolean verifyCheckoutBtn(){
        return checkoutBtn.isDisplayed();
    }

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

    @FindBy(xpath = "//div[@id='checkout_summary_container']")
    private WebElement checkoutSum;
    public boolean verifyCheckoutSum(){
        return checkoutSum.isDisplayed();
    }

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishBtn;
    public void clickFinishBtn(){
        finishBtn.click();
    }

    @FindBy(xpath = "//button[@id='back-to-products']")
    private WebElement backHomeBtn;
    public void clickBackBtn(){
        backHomeBtn.click();
    }

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement prodOne;
    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement prodTwo;
    public void addProduct(){
        prodOne.click();
        prodTwo.click();
    }

    @FindBy(xpath = "//button[@id='remove-sauce-labs-onesie']")
    private WebElement removeProdOne;
    public void removeOne(){
        removeProdOne.click();
    }

}
