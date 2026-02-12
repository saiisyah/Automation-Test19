package stepdef;

import io.cucumber.java.en.Then;
import pages.HomePage;

public class HomeStepDef extends BaseTest{

    HomePage homePage;

    @Then("user is on Homepage")
    public void userSuccessfullyOnHomePage() {
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }
}
