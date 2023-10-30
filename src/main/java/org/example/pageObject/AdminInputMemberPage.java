package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminInputMemberPage {
    public static WebDriver webDriver;
    public AdminInputMemberPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//h3[.='Input Member']")
    public static WebElement inputMemberPage;
    @FindBy(xpath = "//input[@id='input-fullname']")
    public static WebElement clickFieldName;
    @FindBy(xpath = "//input[@id='input-email']")
    public static WebElement clickFieldEmail;
    @FindBy(xpath = "//input[@id='input-password']")
    public static WebElement clickFieldPassword;
    @FindBy(xpath = "//input[@id='input-fullname']")
    private WebElement name;
    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement email;
    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement password;
    @FindBy(xpath = "//select[@id='dropdown-role']")
    public static WebElement dropdownRole;
    @FindBy(xpath = "//select[@id='dropdown-role']")
    public static WebElement dropdownChooseRole;
    @FindBy(xpath = "//select[@id='dropdown-class']")
    public static WebElement dropdownClass;
    @FindBy(xpath = "//select[@id='dropdown-class']")
    public static WebElement dropdownChooseClass;
    @FindBy(xpath = "//option[@id='mentor']")
    public static WebElement chooseRoleData;
    @FindBy(xpath = "//option[.='QE - 11']")
    public static WebElement chooseClassData;
    @FindBy(xpath = "//button[@id='btn-addMember']")
    public static WebElement buttonAdd;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    public static WebElement buttonOkRegister;


    // -------------ADMIN INPUT MEMBER-----------
    public void clickButtonInputMemberAdmin() {
        inputMemberPage.click();
    }
    public boolean verifyUserOnInputMemberPage(){
        return inputMemberPage.isDisplayed();
    }
    public void clickFieldNameInputMemberAdmin() {
        clickFieldName.click();
    }
    public void clickFieldEmailInputMemberAdmin() {
        clickFieldEmail.click();
    }
    public void clickFieldPasswordInputMemberAdmin() {
        clickFieldPassword.click();
    }
    public void setName(String nme) {
//        name.clear();
        name.sendKeys(nme);
    }
    public void setEmail(String mail) {
//        name.clear();
        email.sendKeys(mail);
    }
    public void setPassword(String pswd) {
//        name.clear();
        password.sendKeys(pswd);
    }
    public void clickButtonDropdownButtonAdmin() {
        dropdownRole.click();
    }
    public boolean verifyUserSeeOthersRole(){
        return dropdownChooseRole.isDisplayed();
    }
    public void clickButtonDropdownInputMemberAdmin() {
        dropdownClass.click();
    }
    public boolean verifyUserSeeOthersClassInputMember(){
        return dropdownChooseClass.isDisplayed();
    }
    public void clickDataRoleInputMemberAdmin() {
        chooseRoleData.click();
    }
    public void clickDataClassInputMemberAdmin() {
        chooseClassData.click();
    }
    public void clickButtonAddMember() {
        buttonAdd.click();
    }
    public void clickButtonOkInputMember() {
        buttonOkRegister.click();
    }
}

