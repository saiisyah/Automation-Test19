package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By inputTextUsername = By.id("user-name");
    By inputTextPassword = By.id("password");
    By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void toLoginButton() {
        driver.get("https://www.saucedemo.com/");
    }

    public void textUsername(String username) {
        driver.findElement(inputTextUsername).sendKeys(username);
    }

    public void textPassword(String password) {
        driver.findElement(inputTextPassword).sendKeys(password);
    }

    public void clickLogginButton() {
        driver.findElement(loginButton).click();
    }

    public boolean isOnLoginPage() {
        return driver.getCurrentUrl().contains("https://www.saucedemo.com/");
    }

    public boolean isErrorMessagedDisplayed(String errorMessage) {
        return driver.getPageSource().contains(errorMessage);
    }
}
