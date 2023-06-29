package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.HomePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class FilterSteps {
    public WebDriver driver = Hooks.driver;

    public FilterSteps(){
        super();
    }

    HomePage homePage = new HomePage(driver);

    @When("User Sorting product by {string}")
    public void userSortingProductBy(String label) {
        homePage.filterProduct(label);
    }

    @Then("Product is sorted {string} and {string}")
    public void productIsSorted(String textPrice, String textName) {
        Assert.assertEquals(textPrice, homePage.getProdPrice());
        Assert.assertEquals(textName, homePage.getProdName());
    }
}
