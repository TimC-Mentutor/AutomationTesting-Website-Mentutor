package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.MentorProfilePage;
import org.example.pageObject.MentorTaskPage;
import org.example.pageObject.Utils.ConstantMentor;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MentorProfileSteps {
    private WebDriver driver = Hooks.driver;
    private WebDriverWait driverWait = Hooks.driverWait;

    MentorProfilePage mentorProfilePage = new MentorProfilePage(driver);
    @Then("User click button profile mentor")
    public void userClickButtonProfileMentor() {
        driverWait.until(ExpectedConditions.elementToBeClickable(MentorProfilePage.buttonProfile));
        mentorProfilePage.clickButtonProfileMentor();
    }

    @And("User already on profile page mentor")
    public void userAlreadyOnProfilePageMentor() {
        Assert.assertTrue(mentorProfilePage.verifyOnProfilePageMentor());
    }

    @Then("User click button symbol pencil")
    public void userClickButtonSymbolPencil() {
        driverWait.until(ExpectedConditions.elementToBeClickable(MentorProfilePage.buttonPencil));
        mentorProfilePage.clickButtonPencilProfileMentor();
    }

    @And("User already on edit profile")
    public void userAlreadyOnEditProfile() {
        Assert.assertTrue(mentorProfilePage.verifyOnEditProfileMentor());
    }

    @When("User input {string} as a name {string} as a email {string} as a password {string} as a profile")
    public void userInputAsANameAsAEmailAsAPasswordAsAImages(String name, String email, String password, String images) throws InterruptedException {
        mentorProfilePage.setEditNameProfileMentor(name);
        mentorProfilePage.setEditEmailProfileMentor(email);
        mentorProfilePage.setEditPsswdProfileMentor(password);
        mentorProfilePage.setEditImagesProfileMentor(ConstantMentor.IMAGES +images);
        Thread.sleep(3000);
    }

    @Then("User click button submit edit profile")
    public void userClickButtonSubmitEditProfile() throws InterruptedException{
        driverWait.until(ExpectedConditions.elementToBeClickable(MentorProfilePage.buttonSubmitEdtProflMentor));
        mentorProfilePage.clickButtonSubmitEditProfileMentor();
        Thread.sleep(3000);

    }

    @Then("User click button OK succes update profile on profile mentor page")
    public void userClickButtonOKSuccesUpdateProfileOnProfileMentorPage() {
        driverWait.until(ExpectedConditions.elementToBeClickable(MentorProfilePage.buttonOKsuccesUpdateProfileMentorPage));
        mentorProfilePage.clickButtonOkSuccessUpdateProfileMentorPage();


    }
}
