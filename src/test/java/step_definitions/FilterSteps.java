package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class FilterSteps {
    public WebDriver driver = Hooks.driver;

    public FilterSteps(){
        super();
    }

    LoginPage loginPage = new LoginPage(driver);

    @When("User Sorting product by {string}")
    public void userSortingProductBy(String label) {
        loginPage.filterProduct(label);
    }

    @Then("Product is sorted {string} and {string}")
    public void productIsSorted(String textPrice, String textName) {
        Assert.assertEquals(textPrice, loginPage.getProdPrice());
        Assert.assertEquals(textName, loginPage.getProdName());
    }
}
