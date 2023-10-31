package org.example.pageObject;

import org.openqa.selenium.JavascriptExecutor;
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
    @FindBy(xpath = "//input[@id='btn-gbr']")
    private WebElement uploadMenteeForumPage;
    @FindBy(css = ".pb-9 div:nth-of-type(1) #Input-comment")
    public static WebElement menteeCommentForumPage;
    @FindBy(css = ".pb-9 div:nth-of-type(1) #btn-sendComment")
    public static WebElement sendMenteeCommentForumPage;

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
        ((JavascriptExecutor)webDriver).executeScript("arguments[0].setAttribute('style', 'visibility:visible'); arguments[0].setAttribute('style', 'display:block');", uploadMenteeForumPage);
        uploadMenteeForumPage.sendKeys(image);
    }
    public void inputCommentMenteeForumPage(String comment){
        menteeCommentForumPage.sendKeys(comment);
    }
    public void clickButtonCommentMenteeForumPage(){
        sendMenteeCommentForumPage.click();
    }
    public boolean verifyPopUpMenteeForumPage(){
        return popUpMenteeForumPage.isDisplayed();
    }
}
