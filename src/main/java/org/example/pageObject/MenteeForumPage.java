package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenteeForumPage {
    public static WebDriver webDriver;
    public MenteeForumPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//h3[.='Forum']")
    public static WebElement menteeForumPage;
    @FindBy(xpath = "//input[@id='input-status']")
    private WebElement inputStatusMenteeForumPage;
    @FindBy(id = "btn-send")
    public static WebElement sendButtonMenteeForumPage;
    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement popUpMenteeForumPage;
    @FindBy(css = "#btn-upload-gbr")
    private WebElement uploadMenteeForumPage;

    public void clickonMenteeForumPage(){
        menteeForumPage.click();
    }
    public void inputStatusOnMenteeForumPage(String status){
        inputStatusMenteeForumPage.sendKeys(status);
    }
    public void clickOnSendButtonMenteeForumPage(){
        sendButtonMenteeForumPage.click();
    }
    public void uploadImageMenteeForumPage(String image){
        uploadMenteeForumPage.sendKeys(image);
    }

    public boolean verifyPopUpMenteeForumPage(){
        return popUpMenteeForumPage.isDisplayed();
    }
}
