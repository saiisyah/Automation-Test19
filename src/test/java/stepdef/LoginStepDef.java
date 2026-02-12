    package stepdef;

    import io.cucumber.java.en.And;
    import io.cucumber.java.en.Then;
    import pages.LoginPage;

    import static org.junit.Assert.assertTrue;

    public class LoginStepDef extends BaseTest{

        LoginPage loginPage;

        @io.cucumber.java.en.Given("user already on the login page")
        public void userAlreadyOnTheLoginPage() {
            loginPage = new LoginPage(driver);
            loginPage.toLoginButton();
        }

        @io.cucumber.java.en.And("user input email or username {string}")
        public void userInputEmailOrUsername(String username) {
            loginPage.textUsername(username);
        }

        @io.cucumber.java.en.And("user input password {string}")
        public void userInputPassword(String password) {
            loginPage.textPassword(password);
        }

        @io.cucumber.java.en.When("user clicked login button")
        public void userClickedLoginButton() {
            loginPage.clickLogginButton();
        }

        @Then("user cannot logged in to Dashboard")
        public void userCannotLoggedInToDashboard() {
            assertTrue(loginPage.isOnLoginPage());
        }

        @And("user see error message {string}")
        public void userSeeErrorMessage(String usernameOrPasswordIsInvalid) {
            assertTrue(loginPage.isErrorMessagedDisplayed(usernameOrPasswordIsInvalid));
        }

        @And("user input invalid username {string}")
        public void userInputInvalidUsername(String username) {
            loginPage.textUsername(username);
        }

        @Then("user cannot logged in because {string}")
        public void userCannotLoggedInBecause(String reason) {
            assertTrue(loginPage.isErrorMessagedDisplayed(reason));
        }
    }

