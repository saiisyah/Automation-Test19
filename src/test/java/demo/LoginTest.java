package page;

import SauceDemo.HomePage;
import SauceDemo.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LoginTest {

    @Test
    public void loginTest() {
        WebDriver driver = WebDriverManager.chromedriver().create();

        LoginPage.loginPage = new LoginPage(driver);
        HomePage.homePage = new HomePage(driver);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.saucedemo.com/");

        loginPage.inputUsername("standard")
    }
}
