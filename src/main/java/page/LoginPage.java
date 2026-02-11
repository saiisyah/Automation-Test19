package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By inputUsername = By.id("user-name");
    By inputPassword = By.id("password");
    By loginButton = By.id("login-button");

    public loginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void InputUsername(String username) {
        driver.findElement(inputUsername).sendKeys(username);
    }

    public void InputPassword(String password) {
        driver.findElement(inputPassword).sendKeys(password);
    }

    public void clickButton(){
        driver.findElement(loginButton).click();
    }
}
