package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {
    By appLogo = By.xpath("//div[@class='app_logo']");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public String getAppLogoText() {
        waitForPageLoadComplete();
        return driver.findElement(appLogo).getText();
    }
}
