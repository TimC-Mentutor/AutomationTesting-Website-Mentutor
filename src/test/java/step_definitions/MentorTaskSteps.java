package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
import org.example.pageObject.MentorTaskPage;
import org.example.pageObject.Utils.ConstantMentor;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class MentorTaskSteps {
    private WebDriver driver = Hooks.driver;
    private WebDriverWait driverWait = Hooks.driverWait;

    MentorTaskPage mentorTaskPage = new MentorTaskPage(driver);


// -------------TASK MENTOR-----------

    @Then("User click button task mentor")
    public void userClickButtonTaskMentor() {
        driverWait.until(ExpectedConditions.elementToBeClickable(MentorTaskPage.taskPage));
        mentorTaskPage.clickButtonTaskMentor();
    }

    @Then("User click button elipsis on task mentor")
    public void userClickButtonElipsisOnTaskMentor() {
        driverWait.until(ExpectedConditions.elementToBeClickable(MentorTaskPage.elipsisTask));
        mentorTaskPage.clickButtonElipsisOnTaskMentor();
    }

    @And("User see button edit and delete")
    public void userSeeButtonEditAndDelete() {
        Assert.assertTrue(mentorTaskPage.verifyUserSeeButtonEditAndDelete());

    }
    @And("User already on task page mentor")
    public void userAlreadyOnTaskPageMentor() {
        Assert.assertTrue(mentorTaskPage.verifyOnTaskPageMentor());
    }

    @When("User input {string} as a title {string} as a description {string} as a due date {string} as a attachment {string} as a images")
    public void userInputAsATitleAsADescriptionAsADueDateAsAAttachmentAsAImages(String title, String description, String due_date, String attachment, String images) {
        mentorTaskPage.setTitle(title);
        mentorTaskPage.setDescription(description);
        mentorTaskPage.setDue_Date(due_date);

    }

    @Then("User click button add on task mentor")
    public void userClickButtonAddOnTaskMentor() throws InterruptedException {
        driverWait.until(ExpectedConditions.elementToBeClickable(MentorTaskPage.buttonAddTask));
        mentorTaskPage.clickButtonAddOnTaskMentor();
//        Thread.sleep(10000);
    }

    @Then("User click OK on task created")
    public void userClickOKOnTaskCreated() {
        driverWait.until(ExpectedConditions.elementToBeClickable(MentorTaskPage.closeBtnTaskCreated));
        mentorTaskPage.clickButtonTaskCreatedOnTaskMentor();
    }

    @Then("User see error message")
    public void userSeeErrorMessage() {
        driverWait.until(ExpectedConditions.elementToBeClickable(MentorTaskPage.buttonAddTask));
        Assert.assertTrue(mentorTaskPage.verifyUserSeeErrorTitle());
        Assert.assertTrue(mentorTaskPage.verifyUserSeeErrorDescription());
        Assert.assertTrue(mentorTaskPage.verifyUserSeeErrorDueDate());
        Assert.assertTrue(mentorTaskPage.verifyUserSeeErrorAttachment());
    }

    @Then("User see error message on field due date")
    public void userSeeErrorMessageOnFieldDueDate() {
//        driverWait.until(ExpectedConditions.elementToBeClickable(MentorTaskPage.buttonAddTask));
        Assert.assertTrue(mentorTaskPage.verifyUserSeeErrorInvalidDate());

    }


    @Then("User click button edit")
    public void userClickButtonEdit() throws InterruptedException {
        mentorTaskPage.clickButtonEditTaskOnTaskMentor();
        Thread.sleep(3000);
    }

    @When("User input {string} as a title {string} as a description {string} as a due date {string} as a attachment {string} as a images on edit task")
    public void userInputAsATitleAsADescriptionAsADueDateAsAAttachmentAsAImagesOnEditTask(String title, String description, String due_date, String attachment, String images) {
        mentorTaskPage.setEditTitle(title);
        mentorTaskPage.setEditDescription(description);
        mentorTaskPage.setEditDueDate(due_date);
        mentorTaskPage.setEditAttachment(ConstantMentor.DOCS + attachment);
        mentorTaskPage.setEditImages(ConstantMentor.IMAGES + images);
    }

    @Then("User click button submit")
    public void userClickButtonSubmit() {
        mentorTaskPage.clickButtonSubmitEditTaskOnTaskMentor();
    }

    @Then("User click OK on success update")
    public void userClickOKOnSuccessUpdate() {
        driverWait.until(ExpectedConditions.elementToBeClickable(MentorTaskPage.closeBtnUpdateTask));
        mentorTaskPage.clickButtonUpdateTaskOnTaskMentor();
    }
}
