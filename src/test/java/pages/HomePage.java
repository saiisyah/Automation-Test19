package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomePage {

    By tittleProduct = By.cssSelector("#item_0_title_link");
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void validateOnHomePage(){
        WebElement productElement = driver.findElement(tittleProduct);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Bike Light", productElement.getText());
    }
}
