package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.HomePage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LogoutSteps {

    public WebDriver driver = Hooks.driver;

    public LogoutSteps(){
        super();
    }

    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);

    @When("Click side navbar icon")
    public void clickSideNavbarIcon() throws InterruptedException {
        homePage.clickNavbarIcon();
        Thread.sleep(500);
    }

    @And("Click Logout")
    public void clickLogout() {
        homePage.clickLogout();
    }

    @Then("Should be on Login Page")
    public void shouldBeOnLoginPage() {
        Assert.assertTrue(loginPage.verifyLoginPage());
    }

}
