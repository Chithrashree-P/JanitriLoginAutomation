package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By userIdField = By.xpath("//input[@placeholder='Enter your User ID']");
    private By passwordField = By.xpath("//input[@placeholder='Enter your Password']");
    private By loginButton = By.xpath("//button[text()='Log In']");
    private By eyeIcon = By.xpath("//button[contains(@class,'eye-icon') or @type='button']");
    private By errorMessage = By.xpath("//div[contains(@class,'error') or contains(text(),'Invalid')]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserId(String userId) {
        driver.findElement(userIdField).clear();
        driver.findElement(userIdField).sendKeys(userId);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void togglePasswordVisibility() {
        driver.findElement(eyeIcon).click();
    }

    public boolean isLoginButtonEnabled() {
        return driver.findElement(loginButton).isEnabled();
    }

    public String getErrorMessage() {
        try {
            return driver.findElement(errorMessage).getText();
        } catch (Exception e) {
            return "";
        }
    }
}
