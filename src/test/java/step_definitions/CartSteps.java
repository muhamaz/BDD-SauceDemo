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
    public WebDriver driver = Hooks.driver;

    public CartSteps(){
        super();
    }

    LoginPage loginPage = new LoginPage(driver);
    CartPage cartPage = new CartPage(driver);

    @Given("Already login on website sauce demo")
    public void verifyLogin(){
        loginPage.setUserName("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.btnLogin();
    }
    @And("Already on homepage")
    public void verifyHomePage(){
        Assert.assertTrue(loginPage.verifyHomePage());
    }

    @When("Click add to cart button")
    public void cartButton(){
        cartPage.addProduct();
    }

    @And("Click cart icon")
    public void cartIcon(){
        cartPage.cart();
    }

    @Then("The added product should be displayed")
    public void verifyProductItem(){
        Assert.assertTrue(cartPage.verifyProductList());
    }

    @And("Click remove on product item")
    public void clickRemoveOnProductItem() throws InterruptedException {
        Thread.sleep(1000);
        cartPage.removeProduct();
    }

    @Then("Product item should be removed")
    public void productItemShouldBeRemoved() {
        Assert.assertFalse(cartPage.verifyRemoveProd());
    }
}
