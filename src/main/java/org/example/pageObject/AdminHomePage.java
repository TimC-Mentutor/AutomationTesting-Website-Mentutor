package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePage {
    public static WebDriver webDriver;
    public AdminHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//h3[.='Home']")
    public static WebElement homePage;
    @FindBy(css = "[index='0'] #icon-options")
    public static WebElement dropdownButton;
    @FindBy(xpath = "//div[@class='w-full h-[30rem] md:h-[21rem] bg-card rounded-xl md:rounded-[20px]  text-xs md:text-base overflow-auto mb-5']/div[2]//ul[@class='dropdown-content menu p-1 shadow-md bg-card rounded-[10px] w-[6rem] text-sm text-abu']")
    public static WebElement dropdownEditDelete;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/ul[1]/label[1]")
    public static WebElement dropdownButtonEdit;
    @FindBy(xpath = "//div[@class='flex flex-col gap-3 ']")
    public static WebElement popupEditProfile;
    @FindBy(xpath = "//input[@id='input-fullname']")
    private WebElement name;
    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement email;
    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement password;
    @FindBy(xpath = "//button[@id='btn-submitAdmin']")
    public static WebElement buttonSubmit;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    public static WebElement buttonOkSubmited;


    // -------------ADMIN HOME-----------
    public void clickButtonHomeAdmin() {
        homePage.click();
    }
    public boolean verifyUserOnHomePage(){
        return homePage.isDisplayed();
    }
    public void clickButtonDropdownButtonAdmin() {
        dropdownButton.click();
    }
    public boolean verifyUserSeeButtonEditAndDelete(){
        return dropdownEditDelete.isDisplayed();
    }
    public void clickButtonDropdownEdit() {
        dropdownButtonEdit.click();
    }
    public boolean verifyUserSeePopupEditUser(){
        return popupEditProfile.isDisplayed();
    }
    public void setName(String nme) {
        name.clear();
        name.sendKeys(nme);
    }
    public void setEmail(String mail) {
        email.clear();
        email.sendKeys(mail);
    }
    public void setPassword(String pswd) {
        password.clear();
        password.sendKeys(pswd);
    }
    public void clickButtonSubmitOnPopupEditUserAdmin() {
        buttonSubmit.click();
    }
    public void clickButtonOkSubmitOnPopupEditUserAdmin() {
        buttonOkSubmited.click();
    }

}
