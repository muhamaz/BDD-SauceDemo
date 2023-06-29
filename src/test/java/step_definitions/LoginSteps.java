package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    public WebDriver webDriver;

    public LoginSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("Already on login page")
    public void verifyLoginPage(){
        LoginPage loginPage= new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyLoginPage());
    }

    @When("User input {string} as userName and input {string} as password")
    public void inputCredential(String userName, String password){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setUserName(userName);
        loginPage.setPassword(password);
    }


    @And("Click login button")
    public void clickLoginButton() {
        LoginPage loginpage = new LoginPage(webDriver);
        loginpage.btnLogin();
    }

    @Then("Redirect to homepage")
    public void redirectToHomepage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyHomePage());
        Thread.sleep(3000);
    }

    @Then("Error message {string} should appear")
    public void errorMessageShouldAppear(String message) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertEquals(message, loginPage.errorText());
        Thread.sleep(3000);
    }
}
