package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CartPage;
import org.example.pageObject.CheckoutPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutSteps {

    public WebDriver webDriver;

    public CheckoutSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("Already adding item to cart")
    public void addItem(){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.addProduct();

    }

    @And("Already on cart page")
    public void verifyCartPage(){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.cart();
    }

    @When("Click checkout button")
    public void clickBtnCheckout(){
        CheckoutPage checkPage = new CheckoutPage(webDriver);
        checkPage.clickCheckout();
    }

    @And("Redirect to checkout page")
    public void verifyCheckoutPage() throws InterruptedException {
        CheckoutPage checkPage = new CheckoutPage(webDriver);
        Assert.assertTrue(checkPage.verifyCheckoutPage());
        Thread.sleep(3000);

    }


    @And("User input {string} as firstName {string} as lastName and {int} as zipPostalCode")
    public void userInputAsFirstNameAsLastNameAndAsZipPostalCode(String firstName, String lastName, int zipPostalCode) {
        CheckoutPage checkPage = new CheckoutPage(webDriver);
        checkPage.setFirstName(firstName);
        checkPage.setLastName(lastName);
        checkPage.setPostalCode(zipPostalCode);
    }

    @And("Click continue button")
    public void clickContinueButton() {
        CheckoutPage checkPage = new CheckoutPage(webDriver);
        checkPage.clickContinue();
    }

    @And("Display checkout information")
    public void displayCheckoutInformation() throws InterruptedException {
        CheckoutPage checkPage = new CheckoutPage(webDriver);
        Assert.assertTrue(checkPage.verifyCheckoutSum());
        Thread.sleep(3000);

    }

    @And("Click finish button")
    public void clickFinishButton() {
        CheckoutPage checkPage = new CheckoutPage(webDriver);
        checkPage.clickFinishBtn();
    }

    @Then("Click back home button")
    public void clickBackHomeButton() throws InterruptedException {
        CheckoutPage checkPage = new CheckoutPage(webDriver);
        Thread.sleep(3000);
        checkPage.clickBackBtn();
    }
}
