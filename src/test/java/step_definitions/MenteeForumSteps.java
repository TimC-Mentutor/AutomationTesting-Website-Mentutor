package step_definitions;

import io.cucumber.java.en.And;
import org.example.pageObject.MenteeForumPage;

import org.example.pageObject.MentorTaskPage;
import org.example.pageObject.Utils.ConstantMenteeForum;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenteeForumSteps {

    private WebDriver driver = Hooks.driver;
    private WebDriverWait driverWait = Hooks.driverWait;

    MenteeForumPage menteeForumPage = new MenteeForumPage(driver);

//CASE 1,2,4,5
    @And("User click on mentee forum page")
    public void userClickOnMenteeForumPage() {
        driverWait.until(ExpectedConditions.elementToBeClickable(MenteeForumPage.menteeForumPage));
        menteeForumPage.clickonMenteeForumPage();
    }

    @And("Input {string} in the forum field")
    public void inputInTheForumField(String status) {
        menteeForumPage.inputStatusOnMenteeForumPage(status);
    }
//CASE 3
    @And("Click Send button on mentee forum")
    public void clickSendButtonOnMenteeForum() {
        driverWait.until(ExpectedConditions.elementToBeClickable(MenteeForumPage.sendButtonMenteeForumPage));
        menteeForumPage.clickOnSendButtonMenteeForumPage();
    }

    @And("there should be a pop up in the mentee forum page")
    public void thereShouldBeAPopUpInTheMenteeForumPage() {
        driverWait.until(ExpectedConditions.elementToBeClickable(menteeForumPage.sendButtonMenteeForumPage));
        Assert.assertTrue(menteeForumPage.verifyPopUpMenteeForumPage());
    }
//CASE6
    @And("User input {string} in the comment field")
    public void userInputInTheCommentField(String comment) throws InterruptedException {
        driverWait.until(ExpectedConditions.elementToBeClickable(menteeForumPage.menteeCommentForumPage));
        menteeForumPage.inputCommentMenteeForumPage(comment);

    }

    @And("User upload images with {string} as image file")
    public void userUploadImagesWithAsImageFile(String image) {
        menteeForumPage.uploadImageMenteeForumPage(ConstantMenteeForum.IMAGES + image);
    }

    @And("Send Comment in comment forum mentee")
    public void sendCommentInCommentForumMentee() {
        menteeForumPage.clickButtonCommentMenteeForumPage();
    }

    @And("There should be a comment posted")
    public void thereShouldBeACommentPosted() {
    }
}
