package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MentorProfilePage {
    public static WebDriver webDriver;
    public MentorProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//h3[.='Profile']")
    public static WebElement buttonProfile;
    @FindBy(xpath = "//h1[@class='text-putih text-lg lg:text-2xl font-medium mb-2']")
    private WebElement profilePage;
    @FindBy(xpath = "//label[@class='h-8 w-8 md:h-10 md:w-10 bg-card shadow-md text-putih flex items-center justify-center rounded-[5px] cursor-pointer']")
    public static WebElement buttonPencil;
    @FindBy(xpath = "//h3[@class='font-medium text-lg text-putih mb-2']")
    private WebElement editProfilePage;
    @FindBy(css = "//input[@id='input-fullname']")
    private WebElement editNameProfileMentor;
    @FindBy(css = "//input[@id='input-email']")
    private WebElement editEmailProfileMentor;
    @FindBy(css = "//input[@id='input-password']")
    private WebElement editPasswordProfileMentor;
    @FindBy(css = "//label[@id='btn-upload-gbr']")
    private WebElement editImagesProfileMentor;
    @FindBy(css = "//button[@id='btn-submitMentee']")
    public static WebElement buttonSubmitEdtProflMentor;





    public void clickButtonProfileMentor() {
        buttonProfile.click();
    }
    public boolean verifyOnProfilePageMentor(){
        return profilePage.isDisplayed();
    }
    public void clickButtonPencilProfileMentor() {
        buttonPencil.click();
    }
    public boolean verifyOnEditProfileMentor(){
        return editProfilePage.isDisplayed();
    }
    public void clickButtonSubmitEditProfileMentor() {
        buttonSubmitEdtProflMentor.click();
    }
    public void setEditNameProfileMentor(String edtNmnPrflMntr) {
        editNameProfileMentor.sendKeys(edtNmnPrflMntr);
    }
    public void setEditEmailProfileMentor(String edtEmlPrflMntr) {
        editEmailProfileMentor.sendKeys(edtEmlPrflMntr);
    }
    public void setEditPsswdProfileMentor(String edtPsswdPrflMntr) {
        editPasswordProfileMentor.sendKeys(edtPsswdPrflMntr);
    }
    public void setEditImagesProfileMentor(String edtimgsPrflMntr) {
        editImagesProfileMentor.sendKeys(edtimgsPrflMntr);
    }
}
