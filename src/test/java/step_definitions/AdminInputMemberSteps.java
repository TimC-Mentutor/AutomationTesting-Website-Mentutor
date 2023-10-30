package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.AdminHomePage;
import org.example.pageObject.AdminInputMemberPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminInputMemberSteps {
    private WebDriver driver = Hooks.driver;
    private WebDriverWait driverWait = Hooks.driverWait;

    AdminInputMemberPage adminInputMemberPage = new AdminInputMemberPage(driver);


    // -------------INPUT MEMBER ADMIN-----------
    // case 1
    @Then("User click button input member admin")
    public void userClickButtonInputMemberAdmin() {
        driverWait.until(ExpectedConditions
                .elementToBeClickable(AdminInputMemberPage.inputMemberPage));
        adminInputMemberPage.clickButtonInputMemberAdmin();
    }

    @And("User already on input member page admin")
    public void userAlreadyOnInputMemberPageAdmin() {
        Assert.assertTrue(adminInputMemberPage
                .verifyUserOnInputMemberPage());
    }

    // case 2
    @Then("User click field name on input member admin")
    public void userClickFieldNameOnInputMemberAdmin() {
        driverWait.until(ExpectedConditions
                .elementToBeClickable(AdminInputMemberPage.clickFieldName));
        adminInputMemberPage.clickFieldNameInputMemberAdmin();
    }

    @When("User input {string} as a name")
    public void userInputAsAName(String name) throws InterruptedException {
        adminInputMemberPage.setName(name);
        Thread.sleep(3000);
    }

    // case 3
    @Then("User click field email on input member admin")
    public void userClickFieldEmailOnInputMemberAdmin() {
        driverWait.until(ExpectedConditions
                .elementToBeClickable(AdminInputMemberPage.clickFieldEmail));
        adminInputMemberPage.clickFieldEmailInputMemberAdmin();
    }

    @When("User input {string} as an email")
    public void userInputAsAnEmail(String email) throws InterruptedException {
        adminInputMemberPage.setEmail(email);
        Thread.sleep(3000);
    }

    // case 4
    @Then("User click field password on input member admin")
    public void userClickFieldPasswordOnInputMemberAdmin() {
        driverWait.until(ExpectedConditions
                .elementToBeClickable(AdminInputMemberPage.clickFieldPassword));
        adminInputMemberPage.clickFieldPasswordInputMemberAdmin();
    }

    @When("User input {string} as a password")
    public void userInputAsAPassword(String password) throws InterruptedException {
        adminInputMemberPage.setPassword(password);
        Thread.sleep(3000);
    }

    // case 5
    @Then("User click button dropdown role admin")
    public void userClickButtonDropdownRoleAdmin() {
        driverWait.until(ExpectedConditions
                .elementToBeClickable(AdminInputMemberPage.dropdownRole));
        adminInputMemberPage.clickButtonDropdownButtonAdmin();
    }

    @And("User see others role on button Mentor and Mentee")
    public void userSeeOthersRoleOnButtonMentorAndMentee() {
        Assert.assertTrue(adminInputMemberPage.verifyUserSeeOthersRole());
    }
}