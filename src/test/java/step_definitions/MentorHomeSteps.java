package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.MentorHomePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MentorHomeSteps {
    private WebDriver driver = Hooks.driver;
    private WebDriverWait driverWait = Hooks.driverWait;

    MentorHomePage mentorHomePage = new MentorHomePage(driver);
    @Then("User already on home page mentor")
    public void userAlreadyOnHomePageMentor()  {
        Assert.assertTrue(mentorHomePage.verifyOnHomePageMentor());
    }
    @When("User click button home mentor")
    public void userClickButtonHomeMentor() {
        mentorHomePage.clickButtonHomeMentor();
    }

    @When("User click button view all task")
    public void userClickButtonViewAllTask() {
        mentorHomePage.clickButtonViewAllTaskMentor();
    }

    @And("User already on task page mentor")
    public void userAlreadyOnTaskPageMentor() {
        Assert.assertTrue(mentorHomePage.verifyOnTaskPageMentor());
    }

    @When("User click button title")
    public void userClickButtonTitle() {
        mentorHomePage.clickButtonTitleTaskMentor();
    }

    @Then("User already on detail task page mentor")
    public void userAlreadyOnDetailTaskPageMentor() {
        Assert.assertTrue(mentorHomePage.verifyOnDetailTaskPageMentor());
    }

    @When("User click button attachment")
    public void userClickButtonAttachment() {
        mentorHomePage.clickButtonAttachmentMentor();
    }

    @Then("button attachment can be click")
    public void buttonAttachmentCanBeClick() {
        Assert.assertTrue(mentorHomePage.buttonAttachmentCanBeClick());
    }

    @When("User click button See the Submitted Task by Mentees")
    public void userClickButtonSeeTheSubmittedTaskByMentees() {
        mentorHomePage.clickSeeTheSubmittedTaskByMenteesButton();
    }
}
