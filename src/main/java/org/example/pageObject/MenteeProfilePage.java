package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenteeProfilePage {

    public static WebDriver webDriver;
    public MenteeProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(css = ".h-8")
    public static WebElement menteePencilButton;
    @FindBy(xpath = "//h3[.='Profile']")
    public static WebElement menteeProfilePage;
    @FindBy(css = "h3.font-medium")
    public static WebElement editProfileScreen;
    @FindBy(xpath = "//input[@id='input-fullname']")
    private WebElement inputFullName;
    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement inputEmailonProfile;
    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement inputPasswordProfile;
    @FindBy(id ="btn-upload-gbr" )
    public static WebElement uploadImageProfile;
    @FindBy(xpath = "//button[@id='btn-submitMentee']")
    public static WebElement submitButtonMenteeProfile;



    public void clickMenteePencilButton(){
        menteePencilButton.click();
    }
    public void clickMenteeProfilePage(){menteeProfilePage.click();}
    public void editFullNameMenteeProfilePage(String fullName)
    {inputFullName.sendKeys(fullName);}
    public void editEmailMenteeProfilePage(String email)
    {inputEmailonProfile.sendKeys(email);}
    public void editPasswordMenteeProfilePage(String password)
    {inputPasswordProfile.sendKeys(password);}
    public void uploadImageMenteeProfilePage(String image)
    {uploadImageProfile.sendKeys(image);}
    public void clickSubmitButtonOnMenteeProfilePage()
    {submitButtonMenteeProfile.click();}

    public boolean verifyProfileScreen(){
        return editProfileScreen.isDisplayed();
    }

}
