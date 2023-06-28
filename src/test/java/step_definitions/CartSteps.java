package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CartPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CartSteps {
    public WebDriver webDriver;

    public CartSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }



    @Given("Already login on website sauce demo")
    public void verifyLogin(){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setUserName("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.btnLogin();
    }
    @And("Already on homepage")
    public void verifyHomePage(){
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyHomePage());
    }

    @When("Click add to cart button")
    public void cartButton(){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addProduct();
    }

    @And("Click cart icon")
    public void cartIcon(){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.cart();
    }

    @Then("The added product should be displayed")
    public void verifyProductItem() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        Assert.assertTrue(cartPage.productList());
        Thread.sleep(3000);
    }

}
