package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    public WebDriver driver = Hooks.driver;

    public LoginSteps(){
        super();
    }

    LoginPage loginPage = new LoginPage(driver);

    @Given("Already on login page")
    public void verifyLoginPage(){
        Assert.assertTrue(loginPage.verifyLoginPage());
    }

    @When("User input {string} as userName and input {string} as password")
    public void inputCredential(String userName, String password){
        loginPage.setUserName(userName);
        loginPage.setPassword(password);
    }


    @And("Click login button")
    public void clickLoginButton() {
        loginPage.btnLogin();
    }

    @Then("Redirect to homepage")
    public void redirectToHomepage(){
        Assert.assertTrue(loginPage.verifyHomePage());
    }

    @Then("Error message {string} should appear")
    public void errorMessageShouldAppear(String message){
        Assert.assertEquals(message, loginPage.errorText());
    }
}
