package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
import org.example.pageObject.MentorForumPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MentorForumSteps {
    private WebDriver driver = Hooks.driver;
    private WebDriverWait driverWait = Hooks.driverWait;

    MentorForumPage mentorForumPage = new MentorForumPage(driver);
    @Then("User click button forum mentor")
    public void userClickButtonForumMentor() {
        mentorForumPage.clickButtonForumMentor();
    }

    @And("User already on forum page mentor")
    public void userAlreadyOnForumPageMentor(){
        Assert.assertTrue(mentorForumPage.verifyOnForumPageMentor());
    }

    @Then("User click field comment on forum mentor page")
    public void userClickFieldCommentOnForumMentorPage(){
        driverWait.until(ExpectedConditions.elementToBeClickable(MentorForumPage.fieldCommentForumMentor));
        mentorForumPage.clickFieldCommentOnForumMentor();
    }

    @When("User can input comment {string}")
    public void userCanInputComment(String comment) {
        mentorForumPage.setCommentByMentor(comment);

    }

    @Then("User click button paper plane on forum mentor")
    public void userClickButtonPaperPlaneOnForumMentor() throws InterruptedException{
        mentorForumPage.clickButtonPaperPlaneOnForumMentor();
        Thread.sleep(3000);
    }

    @And("User see comment on forum mentor")
    public void userSeeCommentOnForumMentor() {
        Assert.assertTrue(mentorForumPage.verifyCommentCanBeInputOnForumPageMentor());
    }

    @Then("User click button Load More Comments on forum mentor")
    public void userClickButtonLoadMoreCommentsOnForumMentor() {
        driverWait.until(ExpectedConditions.elementToBeClickable(MentorForumPage.buttonLoadMoreComments));
        mentorForumPage.clickButtonloadMoreCommentOnForumMentor();
    }

    @And("User can see Load More Comments")
    public void userCanSeeLoadMoreComments() {
        Assert.assertTrue(mentorForumPage.verifyCanSeeLoadMoreCommentsOnForumPageMentor());

    }

    @Then("User click button hide on forum mentor")
    public void userClickButtonHideOnForumMentor() {
        driverWait.until(ExpectedConditions.elementToBeClickable(MentorForumPage.buttonHideForumMentor));
        mentorForumPage.clickButtonHideOnForumMentor();
    }




}
