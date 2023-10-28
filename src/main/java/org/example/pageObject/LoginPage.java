package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver webDriver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement email;
    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement password;
    @FindBy(xpath = "//button[@id='btn-login']")
    private WebElement buttonLogin;
    @FindBy(xpath = "//p[.='Password is required']")
    private WebElement errorPassword;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    public static WebElement closeBtnSuccessful;

    public void setEmail(String usrName) {
        email.sendKeys(usrName);
    }

    public void setPassword(String psword) {
        password.sendKeys(psword);
    }

    public void clickButtonLogin() {
        buttonLogin.click();
    }

    public String errorPassword() {
        return errorPassword.getText();
    }

    public boolean emailDisplayed() {
        return email.isDisplayed();
    }

    public void closeBtnLoginSuccess() {
        closeBtnSuccessful.click();
    }
}
