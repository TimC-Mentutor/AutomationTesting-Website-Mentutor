package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminInputClassPage {
    public static WebDriver webDriver;
    public AdminInputClassPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//h3[.='Input Class']")
    public static WebElement inputClassPage;
    @FindBy(xpath = "//input[@name='classname']")
    public static WebElement fieldClassName;
    @FindBy(xpath = "//button[@id='btn-addClass']")
    public static WebElement buttonAddClassName;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    public static WebElement buttonOkCreateClassName;
    @FindBy(xpath = "//p[.='class is required']")
    public static WebElement errorMessageClassName;
    @FindBy(css = ".mb-7 > div:nth-of-type(2) #icon-options")
    public static WebElement dropdownButton;
    @FindBy(css = ".mb-7 > div:nth-of-type(2) .dropdown-content")
    public static WebElement dropdownEditDelete;
    @FindBy(xpath = "//div[@class='w-full h-[26rem] md:h-[18rem] bg-card rounded-xl md:rounded-[20px] text-xs md:text-lg overflow-auto mb-7']/div[2]/p[@class='w-[17%] text-center text-[#23EF11]']")
    public static WebElement tableClassName;


    // -------------ADMIN INPUT CLASS-----------
    public void clickButtonInputClassAdmin() {
        inputClassPage.click();
    }
    public boolean verifyOnInputClassPageAdmin() {
        return inputClassPage.isDisplayed();
    }
    public void clickClassNameFieldAdmin() {
        fieldClassName.click();
    }
    public void setTitle(String classnme) {
        fieldClassName.clear();
        fieldClassName.sendKeys(classnme);
    }
    public void clickAddClassNameAdmin() {
        buttonAddClassName.click();
    }
    public void clickOkCreateClassNameAdmin() {
        buttonOkCreateClassName.click();
    }
    public boolean verifyUserSeeErrorBlankInput(){
        return errorMessageClassName.isDisplayed();
    }
    public void clickButtonDropdownButtonAdmin() {
        dropdownButton.click();
    }
    public boolean verifyUserSeeButtonEditAndDelete(){
        return dropdownEditDelete.isDisplayed();
    }
    public boolean verifyUserSeeStatusActive(){
        return tableClassName.isDisplayed();
    }
}
