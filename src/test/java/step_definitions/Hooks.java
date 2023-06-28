package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    public static WebDriver webDriver;

    @Before
    public void openBrowser(){
        ChromeOptions chrome = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        chrome.addArguments("--remote-allow-origins=*");

        webDriver = new ChromeDriver();
        String url = "https://www.saucedemo.com/";
        webDriver.get(url);
        webDriver.manage().window().maximize();

    }

    @After
    public void closeBrowser(){
        webDriver.quit();
    }
}
