package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenteeTaskPage {
    public static WebDriver webDriver;
    public MenteeTaskPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
//PATH

    @FindBy(xpath = "//h3[contains(.,'Task')]")
    public static WebElement menteeTaskPage;
    @FindBy(css = ".pb-9 > div:nth-of-type(1) .text-black")
     public static WebElement menteeSubmitTaskButton;
    @FindBy(css = ".mb-3")
    public static WebElement menteePopUpTask;
    @FindBy(css = ".pb-9 > div:nth-of-type(2) #btn-submitTask")
    public static WebElement menteeSubmitTaskButton2;
    @FindBy(xpath = "//input[@id='uploadfile-btn']")
    private WebElement menteeUploadFileButton;
    @FindBy(xpath = "//button[@id='btn-submitTask']")
    public static WebElement menteeSubmitUploadButton;
    @FindBy(xpath = "//div[@class='modal-box  bg-card']")
    public static WebElement menteePopUpTaskFeature;


//FUNCTION
    public void clickOnMenteeTaskPage(){
        menteeTaskPage.click();
    }
    public void clickonmenteeSubmitTaskButton(){
        menteeSubmitTaskButton.click();
    }
    public void clickonmenteeSubmitTaskButton2(){
        menteeSubmitTaskButton2.click();
    }
    public void clickonUploadFileButton(String upload){
        menteeUploadFileButton.sendKeys(upload);
    }
    public void clickOnMenteeSubmitUploadButton() {
        menteeSubmitUploadButton.click();
    }



//VALIDATION
    public boolean verifyOnMenteeTaskPage(){
        return menteeTaskPage.isDisplayed();
    }
    public boolean verifyOnmenteeSubmitTaskButton(){
        return menteePopUpTask.isDisplayed();
    }
    public boolean verifymenteePopUpTaskFeature(){
        return menteePopUpTaskFeature.isDisplayed();
    }
}
