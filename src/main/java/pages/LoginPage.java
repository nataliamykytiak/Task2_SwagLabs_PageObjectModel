package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage {
    By usernameInputField = By.xpath("//input[@id='user-name']");
    By passwordInputField = By.xpath("//input[@id='password']");
    By loginButton = By.xpath("//input[@id='login-button']");
    By errorMessage = By.xpath("//h3");

    protected static final String LOGIN_URL = "https://www.saucedemo.com/";
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void goToLoginUrl() {
        driver.get(LOGIN_URL);
    }

    public void enterUsername(String username) {
        waitForVisibilityOfElement(driver.findElement(usernameInputField));
        driver.findElement(usernameInputField).sendKeys(username);
    }

    public void enterPassword(String password) {
        waitForVisibilityOfElement(driver.findElement(passwordInputField));
        driver.findElement(passwordInputField).sendKeys(password);
    }

    public void clearUsernameInput() {
        clearInput(driver.findElement(usernameInputField));
        waitForActionToBeCompleted();
    }

    public void clearPasswordInput() {
        clearInput(driver.findElement(passwordInputField));
        waitForActionToBeCompleted();
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
        waitForActionToBeCompleted();
    }

    public String getErrorMessage() {
        waitForVisibilityOfElement(driver.findElement(errorMessage));
        return driver.findElement(errorMessage).getText();
    }



}
