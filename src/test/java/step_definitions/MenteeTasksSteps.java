package step_definitions;

import io.cucumber.java.en.And;
import org.example.pageObject.MenteeTaskPage;
import org.example.pageObject.MentorTaskPage;
import org.example.pageObject.Utils.ConstantMenteeTask;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static step_definitions.Hooks.driverWait;

public class MenteeTasksSteps {

    private WebDriver driver = Hooks.driver;
    private WebDriverWait driverWait = Hooks.driverWait;

    MenteeTaskPage menteeTaskPage = new MenteeTaskPage(driver);

//CASE 1
    @And("User click on mentee task button")
    public void userClickOnMenteeTaskButton() {
        driverWait.until(ExpectedConditions.elementToBeClickable(MenteeTaskPage.menteeTaskPage));
        menteeTaskPage.clickOnMenteeTaskPage();
    }
    @And("User already on task page")
    public void userAlreadyOnTaskPage() {
        Assert.assertTrue(menteeTaskPage.verifyOnMenteeTaskPage());
    }

    @And("User click on mentee submit your task button on task page")
    public void userClickOnMenteeSubmitYourTaskButtonOnTaskPage() {
        driverWait.until(ExpectedConditions.elementToBeClickable(MenteeTaskPage.menteeSubmitTaskButton));
        menteeTaskPage.clickonmenteeSubmitTaskButton();
    }
    @And("There should be a pop up")
    public void thereShouldBeAPopUp() {
        Assert.assertTrue(menteeTaskPage.verifyOnmenteeSubmitTaskButton());
    }
//CASE2
    @And("User click on mentee submit your task button on the right task page")
    public void userClickOnMenteeSubmitYourTaskButtonOnTheRightTaskPage() {
        driverWait.until(ExpectedConditions.elementToBeClickable(MenteeTaskPage.menteeSubmitTaskButton2));
        menteeTaskPage.clickonmenteeSubmitTaskButton2();
    }
    @And("User click on upload button {string} as file")
    public void userClickOnUploadButton(String file) {
        menteeTaskPage.clickonUploadFileButton(ConstantMenteeTask.DOCS + file);
    }
//CASE3 AND 4
    @And("User click on Submit button on Task mentee feature")
    public void userClickOnSubmitButtonOnTaskMenteeFeature() {
        driverWait.until(ExpectedConditions.elementToBeClickable(MenteeTaskPage.menteeSubmitTaskButton));
        menteeTaskPage.clickOnMenteeSubmitUploadButton();
    }
    @And("User should see pop up as validation")
    public void userShouldSeePopUpAsValidation() {
        Assert.assertTrue(menteeTaskPage.verifymenteePopUpTaskFeature());
    }
}
