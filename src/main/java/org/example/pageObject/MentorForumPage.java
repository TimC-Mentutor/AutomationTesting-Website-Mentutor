package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MentorForumPage {
    public static WebDriver webDriver;
    public MentorForumPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//h3[.='Forum']")
    private WebElement forumMentor;
    @FindBy(xpath = "//h1[@class='text-putih text-lg lg:text-2xl font-medium mb-2']")
    private WebElement onForumMentor;
    @FindBy(xpath = "//div[@class='mt-[3rem] mb-[2rem] space-y-6']/div[2]//input[@id='Input-comment']")
    public static WebElement fieldCommentForumMentor;
    @FindBy(xpath = "//div[@class='mt-[3rem] mb-[2rem] space-y-6']/div[2]//button[@id='btn-sendComment']")
    private WebElement paperPlaneForumMentor;
    @FindBy(xpath = "//p[.='good job']")
    private WebElement commentByMentor;
    @FindBy(xpath = "//div[@class='mt-[3rem] mb-[2rem] space-y-6']/div[2]//p[@id='btn-showcomments']")
    public static WebElement buttonLoadMoreComments;
    @FindBy(xpath = "//p[.='silakan kerjakan ulang']")
    private WebElement loadMoreComments;
    @FindBy(xpath = "//div[@class='mt-[3rem] mb-[2rem] space-y-6']/div[2]//p[@id='btn-hidecomments']")
    public static WebElement buttonHideForumMentor;
    @FindBy(xpath = "//div[@class='h-screen ml-[50px] md:ml-[200px] lg:ml-[320px] relative p-6 md:px-14 md:pt-10 md:pb-10 ']/form[1]//ul[@class='dropdown-content menu p-1 shadow-md bg-card rounded-[10px] w-[6rem] text-sm  text-abu']")
    private WebElement fieldsEditDelete;







    public void clickButtonForumMentor(){
        forumMentor.click();
    }
    public boolean verifyOnForumPageMentor(){
        return onForumMentor.isDisplayed();
    }
    public void clickFieldCommentOnForumMentor(){
        fieldCommentForumMentor.click();
    }
    public void setCommentByMentor(String comment) {
        fieldCommentForumMentor.sendKeys(comment);
    }
    public void clickButtonPaperPlaneOnForumMentor(){
        paperPlaneForumMentor.click();
    }
    public boolean verifyCommentCanBeInputOnForumPageMentor(){
        return commentByMentor.isDisplayed();
    }
    public void clickButtonloadMoreCommentOnForumMentor(){
        buttonLoadMoreComments.click();
    }
    public boolean verifyCanSeeLoadMoreCommentsOnForumPageMentor(){
        return loadMoreComments.isDisplayed();
    }
    public void clickButtonHideOnForumMentor(){
        buttonHideForumMentor.click();
    }
    public boolean verifyUserSeeButtonEditAndDelete(){
        return fieldsEditDelete.isDisplayed();
    }
}
