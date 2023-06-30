package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CartPage;
import org.example.pageObject.CheckoutPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutSteps {

    public WebDriver driver = Hooks.driver;

    public CheckoutSteps(){
        super();
    }

    CheckoutPage checkPage = new CheckoutPage(driver);
    CartPage cartPage = new CartPage(driver);

    @And("Already adding two item {string} and {string} to cart")
    public void alreadyAddingTwoItemToCart(String prodOne, String prodTwo) {
        checkPage.addProduct(prodOne);
        checkPage.addProduct(prodTwo);
    }

    @And("Already on cart page")
    public void verifyCartPage() throws InterruptedException {
        cartPage.cart();
        Thread.sleep(1000);
    }


    @When("User Remove one item")
    public void userRemoveOneItem() throws InterruptedException {
        checkPage.removeOne();
        Thread.sleep(2000);
    }

    @And("Click checkout button")
    public void clickBtnCheckout(){
        checkPage.clickCheckout();
    }

    @And("Redirect to checkout page")
    public void verifyCheckoutPage() throws InterruptedException {
        Assert.assertTrue(checkPage.verifyCheckoutPage());
        Thread.sleep(3000);

    }


    @And("User input {string} as firstName {string} as lastName and {int} as zipPostalCode")
    public void userInputAsFirstNameAsLastNameAndAsZipPostalCode(String firstName, String lastName, int zipPostalCode) {
        checkPage.setFirstName(firstName);
        checkPage.setLastName(lastName);
        checkPage.setPostalCode(zipPostalCode);
    }

    @And("Click continue button")
    public void clickContinueButton() {
        checkPage.clickContinue();
    }

    @And("Display checkout information")
    public void displayCheckoutInformation() throws InterruptedException {
        Assert.assertTrue(checkPage.verifyCheckoutSum());
        Assert.assertEquals("Total: $17.27", checkPage.getTotalPrice());
        Thread.sleep(1000);

    }

    @And("Click finish button")
    public void clickFinishButton() {
        checkPage.clickFinishBtn();
    }

    @Then("Click back home button")
    public void clickBackHomeButton() throws InterruptedException {
        Thread.sleep(500);
        checkPage.clickBackBtn();
    }


    /*Negative Test Case*/
    @Then("Checkout button should not appear")
    public void checkoutButtonShouldNotAppear() {
        Assert.assertFalse(checkPage.verifyCheckoutBtn());
    }

    @And("Click cancel button")
    public void clickCancelButton() throws InterruptedException {
        Thread.sleep(1000);
        checkPage.clickCancelBtn();
    }

    @Then("Should be on Cart Page")
    public void shouldBeOnCartPage() {
        Assert.assertTrue(cartPage.verifyCartPage());
    }
}
