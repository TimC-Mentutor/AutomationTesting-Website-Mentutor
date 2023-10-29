package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.AdminHomePage;
import org.example.pageObject.MentorTaskPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminHomeSteps {

    private WebDriver driver = Hooks.driver;
    private WebDriverWait driverWait = Hooks.driverWait;

    AdminHomePage adminHomePage = new AdminHomePage(driver);


    // -------------HOME ADMIN-----------
// case 1
    @Then("User click button home admin")
    public void userClickButtonHomeAdmin() {
        driverWait.until(ExpectedConditions
                .elementToBeClickable(AdminHomePage.homePage));
        adminHomePage.clickButtonHomeAdmin();
    }

    @And("User already on home page admin")
    public void userAlreadyOnHomePageAdmin() {
        Assert.assertTrue(adminHomePage
                .verifyUserOnHomePage());
    }

// case 2
    @Then("User click button dropdown admin")
    public void userClickButtonDropdownAdmin() {
        driverWait.until(ExpectedConditions
                .elementToBeClickable(AdminHomePage.dropdownButton));
        adminHomePage.clickButtonDropdownButtonAdmin();
    }

    @And("User see dropdown admin button edit and delete")
    public void userSeeDropdownAdminButtonEditAndDelete() throws InterruptedException {
        Assert.assertTrue(adminHomePage
                .verifyUserSeeButtonEditAndDelete());
        Thread.sleep(3000);
    }

// case 3
    @Then("User click button edit on home admin")
    public void userClickButtonEditOnHomeAdmin() throws InterruptedException {
        driverWait.until(ExpectedConditions
                .elementToBeClickable(AdminHomePage.dropdownButtonEdit));
        adminHomePage.clickButtonDropdownEdit();
        Thread.sleep(3000);
    }

    @And("User see popup edit user")
    public void userSeePopupEditUser() {
        Assert.assertTrue(adminHomePage.verifyUserSeePopupEditUser());
    }

// case 4
    @When("User input {string} as a name {string} as an email")
    public void userInputAsANameAsAnEmail(String name, String email) throws InterruptedException {
        adminHomePage.setName(name);
        adminHomePage.setEmail(email);
        Thread.sleep(5000);
    }

    @Then("User click button submit on popup edit user admin")
    public void userClickButtonSubmitOnPopupEditUserAdmin() {
        driverWait.until(ExpectedConditions.elementToBeClickable(AdminHomePage.buttonSubmit));
        adminHomePage.clickButtonSubmitOnPopupEditUserAdmin();
    }

    @Then("User click OK on success updated admin")
    public void userClickOKOnSuccessUpdatedAdmin() {
        driverWait.until(ExpectedConditions.elementToBeClickable(AdminHomePage.buttonOkSubmited));
        adminHomePage.clickButtonOkSubmitOnPopupEditUserAdmin();
    }

    // case 5
    @When("User input {string} as a name {string} as an email {string} as a password")
    public void userInputAsANameAsAnEmailAsAPassword(String name, String email, String password) throws InterruptedException {
        adminHomePage.setName(name);
        adminHomePage.setEmail(email);
        adminHomePage.setPassword(password);
        Thread.sleep(5000);
    }

    @Then("User click OK on succes updated admin")
    public void userClickOKOnFailedUpdatedAdmin() {
        driverWait.until(ExpectedConditions.elementToBeClickable(AdminHomePage.buttonOkSubmited));
        adminHomePage.clickButtonOkSubmitOnPopupEditUserAdmin();
    }
}
