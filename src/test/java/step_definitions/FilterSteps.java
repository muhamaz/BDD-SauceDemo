package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class FilterSteps {
    public WebDriver webDriver;

    public FilterSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("User Sorting product by {string}")
    public void userSortingProductBy(String label) {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.filterProduct(label);
    }

    @Then("Product is sorted {string} and {string}")
    public void productIsSorted(String textPrice, String textName) {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertEquals(textPrice, loginPage.getProdPrice());
        Assert.assertEquals(textName, loginPage.getProdName());
    }
}
