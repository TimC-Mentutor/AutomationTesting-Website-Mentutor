package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MentorHomePage {
    public static WebDriver webDriver;
    public MentorHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//h3[.='Home']")
    private WebElement homePage;
    @FindBy(xpath = "//h3[.='Task']")
    public static WebElement taskPage;
    @FindBy(xpath = "//div[@class='h-screen ml-[50px] md:ml-[200px] lg:ml-[320px] relative p-6 md:px-14 md:pt-10 md:pb-10 ']/form[1]//label[@id='icon-options']")
    public static WebElement elipsisTask;
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







    public boolean verifyOnHomePageMentor() {
        return homePage.isDisplayed();
    }
    public void clickButtonHomeMentor(){
        String xpath = "//h3[.='Home']";
        webDriver.findElement(By.xpath(xpath)).click();
    }
    public void clickButtonViewAllTaskMentor() {
        String xpath = "//p[@id='view-task']";
        webDriver.findElement(By.xpath(xpath)).click();
    }
    public boolean verifyOnTaskPageMentor(){
        return homePage.isDisplayed();
    }
    public void clickButtonTitleTaskMentor() {
        String xpath = "//h1[.='tugas expired']";
        webDriver.findElement(By.xpath(xpath)).click();
    }
    public boolean verifyOnDetailTaskPageMentor(){
        return homePage.isDisplayed();
    }
    public boolean clickButtonAttachmentMentor() {
        String xpath = "//p[.='PhqGLrgwYyqyJ53qNBhE-tugas.pdf']";
        return homePage.isDisplayed();
    }
    public boolean buttonAttachmentCanBeClick(){
        return homePage.isDisplayed();
    }
    public boolean clickSeeTheSubmittedTaskByMenteesButton() {
        String xpath = "//div[@class='space-y-6']/div[1]//p[@id='click-submittedtask']";
        return homePage.isDisplayed();

//        webDriver.findElement(By.xpath(xpath)).click();
    }
    // -------------TASK MENTOR-----------
    public void clickButtonTaskMentor() {
        taskPage.click();
    }
    public void clickButtonElipsisOnTaskMentor() {
        elipsisTask.click();
    }
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
