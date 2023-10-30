package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.MenteeHomePage;
import org.example.pageObject.MentorTaskPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenteeHomeSteps {

    private WebDriver driver = Hooks.driver;
    private WebDriverWait driverWait = Hooks.driverWait;

    MenteeHomePage menteeHomePage = new MenteeHomePage(driver);

//CASE 1

    @And("User Click on Mentee home button")
    public void userClickOnMenteeHomeButton() {
        driverWait.until(ExpectedConditions.elementToBeClickable(MenteeHomePage.menteeHomePage));
        menteeHomePage.clickButtonHomeMentee();
    }
    @And("User already on home page mentee")
    public void userAlreadyOnHomePageMentee() {
        Assert.assertTrue(menteeHomePage.verifyOnMenteeHomePage());
    }
//CASE 2
    @And("User Click on Mentee Submit task button")
    public void userClickOnMenteeTaskButton() {
        driverWait.until(ExpectedConditions.elementToBeClickable(MenteeHomePage.menteeSubmitTaskPage));
        menteeHomePage.clickButtonTaskMentee();
    }

//CASE 3

    @And("User click on mentee logout button")
    public void userClickOnMenteeLogoutButton() {
        driverWait.until(ExpectedConditions.elementToBeClickable(MenteeHomePage.menteeLogoutButton));
        menteeHomePage.clickButtonLogoutMentee();
    }

    @And("User Should see a confirmation pop up")
    public void userShouldSeeAConfirmationPopUp() {
        Assert.assertTrue(menteeHomePage.verifyOnMenteeLogout());
    }
//CASE 4
    @And("User Click on mentee profile icon")
    public void userClickOnMenteeProfileIcon() {
        driverWait.until(ExpectedConditions.elementToBeClickable(MenteeHomePage.menteeProfilepage));
        menteeHomePage.clickProfileIcon();
    }

    @And("User already on profile page")
    public void userAlreadyOnProfilePage() {
        Assert.assertTrue(menteeHomePage.verifyOnProfileIconPage());
    }
}
