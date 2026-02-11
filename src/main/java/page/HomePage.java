package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;

    By bikeLightItem = By.xpath("//*[@id=\"item_0_title_link\"]/div");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean validasiBikeLightDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(bikeLightItem)
        ).isDisplayed();
    }
}
