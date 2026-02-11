package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LoginPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginStepDef extends BaseTest{

    LoginPage loginPage;


    @io.cucumber.java.en.Given("user already on the login page")
    public void userAlreadyOnTheLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    @io.cucumber.java.en.And("user input email or username {string}")
    public void userInputEmailOrUsername(String username) {
        By inputUsername = By.id("user-name");
        driver.findElement(inputUsername).sendKeys(username);
    }

    @io.cucumber.java.en.And("user input password {string}")
    public void userInputPassword(String password) {
        By inputPassword = By.id("password");
        driver.findElement(inputPassword).sendKeys(password);
    }

    @io.cucumber.java.en.When("user clicked login button")
    public void userClickedLoginButton() {
        By loginButton = By.id("login-button");
        driver.findElement(loginButton).click();
    }

    @Then("user successfully on home page")
    public void userSuccessfullyOnHomePage() {
        By bikeLightLocator = By.cssSelector("#item_0_title_link div");
        WebElement bikeLightElement = driver.findElement(bikeLightLocator);
        assertTrue(bikeLightElement.isDisplayed());
        assertEquals("Sauce Labs Bike Light", bikeLightElement.getText());
    }

    @Then("user cannot logged in to Dashboard")
    public void userCannotLoggedInToDashboard() {
        assertTrue(driver.getCurrentUrl().contains("https://www.saucedemo.com/"));
    }

    @And("user see error message {string}")
    public void userSeeErrorMessage(String usernameOrPasswordIsInvalid) {
        assertTrue(driver.getPageSource().contains(usernameOrPasswordIsInvalid));
    }

    @And("user input invalid username {string}")
    public void userInputInvalidUsername(String username) {
        By inputUsername = By.id("user-name");
        driver.findElement(inputUsername).sendKeys(username);
    }

    @Then("user cannot logged in because {string}")
    public void userCannotLoggedInBecause(String reason) {
        LoginPage loginPage = new LoginPage(driver);
        assertTrue(loginPage.isOnLoginPage());
    }
}

