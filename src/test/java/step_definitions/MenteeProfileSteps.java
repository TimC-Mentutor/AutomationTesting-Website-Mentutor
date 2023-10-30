package step_definitions;

import io.cucumber.java.en.And;
import org.example.pageObject.MenteeProfilePage;
import org.example.pageObject.MentorTaskPage;
import org.example.pageObject.Utils.ConstantMenteeProfilePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenteeProfileSteps {

    private WebDriver driver = Hooks.driver;
    private WebDriverWait driverWait = Hooks.driverWait;

    MenteeProfilePage menteeProfilePage = new MenteeProfilePage(driver);
    @And("User already on a Mentee profile page")
    public void userAlreadyOnAMenteeProfilePage() {
        driverWait.until(ExpectedConditions.elementToBeClickable(MenteeProfilePage.menteeProfilePage));
        menteeProfilePage.clickMenteeProfilePage();
    }

    @And("User click on a pencil button")
    public void userClickOnAPencilButton() {
        driverWait.until(ExpectedConditions.elementToBeClickable(MenteeProfilePage.menteePencilButton));
        menteeProfilePage.clickMenteePencilButton();
    }

    @And("There should be an editor screen")
    public void thereShoulBeAnEditorScreen() {
        Assert.assertTrue(menteeProfilePage.verifyProfileScreen());

    }
//CASE2
    @And("User input {string} as a name on a name field")
    public void userInputAsName(String name) {
        menteeProfilePage.editFullNameMenteeProfilePage(name);
    }
//CASE3
    @And("User Input {string} as an email on email field")
    public void userInputAsAnEmailOnEmailField(String email) throws InterruptedException {
        menteeProfilePage.editEmailMenteeProfilePage(email);
        Thread.sleep(2000);
    }
//CASE4
    @And("User input {string} as a password on a password field")
    public void userInputAsAPasswordOnAPasswordField(String password) {
        menteeProfilePage.editPasswordMenteeProfilePage(password);
    }
//CASE5
    @And("User click on an upload button and choose {string} as an image")
    public void userClickOnAnUploadButtonAndChooseAsAnImage(String image)  {
        menteeProfilePage.uploadImageMenteeProfilePage(ConstantMenteeProfilePage.IMAGES + image);
    }
//CASE6
    @And("User click on submit button on mentee profile screen")
    public void userClickOnSubmitButtonOnMenteeProfileScreen() {
        driverWait.until(ExpectedConditions.elementToBeClickable(MenteeProfilePage.submitButtonMenteeProfile));
        menteeProfilePage.clickSubmitButtonOnMenteeProfilePage();
    }
}
