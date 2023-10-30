package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
//import org.example.pageObject.MentorPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSteps {
    private WebDriver driver = Hooks.driver;
    private WebDriverWait driverWait = Hooks.driverWait;

    LoginPage loginPage = new LoginPage(driver);
    @Given("User open the website mentutor")
    public void userOpenTheWebsiteMentutor() {
        Assert.assertTrue(loginPage.emailDisplayed());
    }

    @When("User input {string} as a email {string} as a password")
    public void userInputAsAEmailAsAPassword(String email, String password) {
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        loginPage.clickButtonLogin();
    }
    @Then("User click OK on login successful")
    public void userClickOKOnLoginSuccessful()  {
        driverWait.until(ExpectedConditions.elementToBeClickable(LoginPage.closeBtnSuccessful));
        loginPage.closeBtnLoginSuccess();
    }
}
