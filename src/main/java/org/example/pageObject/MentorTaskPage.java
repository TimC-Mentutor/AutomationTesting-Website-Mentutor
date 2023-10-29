package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MentorTaskPage {
    public static WebDriver webDriver;
    public MentorTaskPage(WebDriver driver) {
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
    @FindBy(xpath = "//input[@name='title']")
    private WebElement title;
    @FindBy(xpath = "//textarea[@id='input-desc']")
    private WebElement description;
    @FindBy(xpath = "//input[@id='input-date']")
    private WebElement dueDate;
    @FindBy(xpath = "//input[@id='uploadfile-btn']")
    private WebElement attachment;
    @FindBy(xpath = "//input[@id='uploadimage-btn']")
    private WebElement images;
    @FindBy(xpath = "//button[@id='input-file']")
    public static WebElement buttonAddTask;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    public static WebElement closeBtnTaskCreated;
    @FindBy(xpath = "//p[.='Title is required']")
    public static WebElement errorTile;
    @FindBy(xpath = "//p[.='Description is required']")
    public static WebElement errorDescription;
    @FindBy(xpath = "//p[.='Due_date is required']")
    public static WebElement errorDueDate;
    @FindBy(xpath = "//p[.='File is required']")
    public static WebElement errorAttachment;
    @FindBy(xpath = "//form[1]//label[@class='hover:text-button px-4 pt-2 text-sm text-abu cursor-pointer']")
    public static WebElement editTask;
    @FindBy(css = "[placeholder='Title']")
    private WebElement editTitle;
    @FindBy(xpath = "//input[@id='input-description']")
    private WebElement editDescription;
    @FindBy(xpath = "//input[@id='input-due_date']")
    private WebElement editDueDate;
    @FindBy(xpath = "//div[@class='flex justify-between items-center']/label[1]")
    private WebElement editAttachment;
    @FindBy(xpath = "//label[2]")
    private WebElement editImages;
    @FindBy(xpath = "//button[@id='btn-submitTask']")
    private WebElement buttonSubmit;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    public static WebElement closeBtnUpdateTask;
    @FindBy(xpath = "//p[.='Invalid Date']")
    public static WebElement invalidDate;


    // -------------TASK MENTOR-----------
    public void clickButtonTaskMentor() {
        taskPage.click();
    }
    public void clickButtonElipsisOnTaskMentor() {
        elipsisTask.click();
    }
    public boolean verifyUserSeeButtonEditAndDelete(){
        return fieldsEditDelete.isDisplayed();
    }
    public boolean verifyOnTaskPageMentor(){
        return homePage.isDisplayed();
    }
    public void setTitle(String ttle) {
        title.sendKeys(ttle);
    }
    public void setDescription(String descrtion) {
        description.sendKeys(descrtion);
    }
    public void setDue_Date(String duDate) {
        dueDate.sendKeys(duDate);
    }
    public void setAttachment(String atchment) {
        attachment.sendKeys(atchment);
    }
    public void setImages(String imgs) {
        images.sendKeys(imgs);
    }
    public void clickButtonAddOnTaskMentor() {
        buttonAddTask.click();
    }

    public void clickButtonTaskCreatedOnTaskMentor() {
        closeBtnTaskCreated.click();
    }
    public boolean verifyUserSeeErrorTitle(){
        return errorTile.isDisplayed();
    }
    public boolean verifyUserSeeErrorDescription(){
        return errorDescription.isDisplayed();
    }
    public boolean verifyUserSeeErrorDueDate(){
        return errorDueDate.isDisplayed();
    }
    public boolean verifyUserSeeErrorAttachment(){
        return errorAttachment.isDisplayed();
    }
    public void clickButtonEditTaskOnTaskMentor() {
        editTask.click();
    }
    public void setEditTitle(String edtttle) {
        editTitle.sendKeys(edtttle);
    }
    public void setEditDescription(String edtdesc) {
        editDescription.sendKeys(edtdesc);
    }
    public void setEditDueDate(String edtdudt) {
        editDueDate.sendKeys(edtdudt);
    }
    public void setEditAttachment(String edtattchmnt) {
        editAttachment.sendKeys(edtattchmnt);
    }
    public void setEditImages(String edtimgs) {
        editImages.sendKeys(edtimgs);
    }
    public void clickButtonSubmitEditTaskOnTaskMentor() {
        buttonSubmit.click();
    }
    public void clickButtonUpdateTaskOnTaskMentor() {
        closeBtnUpdateTask.click();
    }
    public boolean verifyUserSeeErrorInvalidDate(){
        return invalidDate.isDisplayed();
    }
}


