package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    public static WebDriver webDriver;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }


    /*  Filter Func on HomePage*/
    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement filter;
    public void filterProduct(String text){
        Select selectProduct = new Select(filter);
        selectProduct.selectByVisibleText(text);
    }

    /*      Filter Verification by price and product name       */
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
