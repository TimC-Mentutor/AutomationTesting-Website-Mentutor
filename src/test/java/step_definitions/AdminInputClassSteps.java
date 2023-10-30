package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.AdminHomePage;
import org.example.pageObject.AdminInputClassPage;
import org.example.pageObject.MentorTaskPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminInputClassSteps {
    private WebDriver driver = Hooks.driver;
    private WebDriverWait driverWait = Hooks.driverWait;

    AdminInputClassPage adminInputClassPage = new AdminInputClassPage(driver);

    // -------------INPUT CLASS ADMIN-----------
    // case 1
    @Then("User click button input class admin")
    public void userClickButtonInputClassAdmin() {
        driverWait.until(ExpectedConditions
                .elementToBeClickable(AdminInputClassPage.inputClassPage));
        adminInputClassPage.clickButtonInputClassAdmin();
    }

    @And("User already on input class page admin")
    public void userAlreadyOnInputClassPageAdmin() throws InterruptedException {
        Thread.sleep(45000);
        Assert.assertTrue(adminInputClassPage.verifyOnInputClassPageAdmin());
    }

    // case 2
    @Then("User click on field input class name admin")
    public void userClickOnFieldInputClassNameAdmin() throws InterruptedException {
        driverWait.until(ExpectedConditions
                .elementToBeClickable(AdminInputClassPage.fieldClassName));
        adminInputClassPage.clickClassNameFieldAdmin();
//        Thread.sleep(3000);
    }

    // case 3
    @When("User input {string} as a class name")
    public void userInputAsAClassName(String className) {
        adminInputClassPage.setTitle(className);
    }

    @Then("User click button add on input class admin")
    public void userClickButtonAddOnInputClassAdmin() {
        driverWait.until(ExpectedConditions.elementToBeClickable(AdminInputClassPage.buttonAddClassName));
        adminInputClassPage.clickAddClassNameAdmin();
    }

    @Then("User click OK on input class succes created")
    public void userClickOKOnInputClassSuccesCreated() {
        driverWait.until(ExpectedConditions.elementToBeClickable(AdminInputClassPage.buttonOkCreateClassName));
        adminInputClassPage.clickOkCreateClassNameAdmin();
    }

    // case 4
    @Then("User see error message bottom field class name")
    public void userSeeErrorMessageBottomFieldClassName() {
        Assert.assertTrue(adminInputClassPage.verifyUserSeeErrorBlankInput());
    }

    // case 5
    @And("User see table class on input class admin")
    public void userSeeTableClassOnInputClassAdmin() throws InterruptedException {
//        driverWait.until(ExpectedConditions.elementToBeClickable(AdminInputClassPage.tableClassName));
//        Thread.sleep(5000);
        Assert.assertTrue(adminInputClassPage
                .verifyUserSeeStatusActive());
    }

    @Then("User click button dropdown input class admin")
    public void userClickButtonDropdownInputClassAdmin() throws InterruptedException {
        driverWait.until(ExpectedConditions.elementToBeClickable(AdminInputClassPage.dropdownButton));
//        Thread.sleep(3000);
        adminInputClassPage.clickButtonDropdownButtonAdmin();
    }

    @And("User see dropdown input class admin button edit and delete")
    public void userSeeDropdownInputClassAdminButtonEditAndDelete() throws InterruptedException {
        Assert.assertTrue(adminInputClassPage
                .verifyUserSeeButtonEditAndDelete());
//    Thread.sleep(3000);
    }


}
