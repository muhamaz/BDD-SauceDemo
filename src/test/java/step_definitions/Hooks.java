package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void openBrowser(){
        ChromeOptions chrome = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        chrome.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver();
        String url = "https://www.saucedemo.com/";
        driver.get(url);
        driver.manage().window().maximize();

    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
