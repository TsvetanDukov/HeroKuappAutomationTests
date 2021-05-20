package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private WebDriver driver;
    private By statusAlert = By.id("flash");
    private By LogoutButton = By.cssSelector("#content a");

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAlertText() {
        return driver.findElement(statusAlert).getText();
    }

    public LoginPage clickLogoutButton() {
        driver.findElement(LogoutButton).click();
        return new LoginPage(driver);
    }
}
