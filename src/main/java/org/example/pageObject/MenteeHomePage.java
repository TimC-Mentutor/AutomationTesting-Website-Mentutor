package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenteeHomePage {

    public static WebDriver webDriver;

    public MenteeHomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        webDriver = driver;
    }

    @FindBy(xpath = "//h3[.='Home']")
    public static WebElement menteeHomePage;

    @FindBy(xpath = "//label[@id='btn-submitTask']")
    public static WebElement menteeSubmitTaskPage;
    @FindBy(xpath = "//div[@id='btn-logout']")
    public static WebElement menteeLogoutButton;
    @FindBy(xpath = "//h2[@class='swal2-title']")
    public static WebElement menteeLogoutPopUp;
    @FindBy(xpath = "//h3[.='Profile']")
    public static WebElement menteeProfilepage;





    public void clickButtonHomeMentee(){menteeHomePage.click();}
    public void clickButtonTaskMentee(){menteeSubmitTaskPage.click();}
    public void clickButtonLogoutMentee(){menteeLogoutButton.click();}
    public void clickProfileIcon(){menteeProfilepage.click();}


    public boolean verifyOnMenteeHomePage(){
        return menteeHomePage.isDisplayed();
    }
    public boolean verifyOnMenteeLogout(){
        return menteeLogoutPopUp.isDisplayed();
    }
    public boolean verifyOnProfileIconPage(){
        return menteeProfilepage.isDisplayed();
    }
}


