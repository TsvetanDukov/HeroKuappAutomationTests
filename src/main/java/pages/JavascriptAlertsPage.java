package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavascriptAlertsPage {

    private WebDriver driver;
    private By jsAlertButton = By.xpath("//button[@onclick = 'jsAlert()']");
    private By jsConfirmButton = By.xpath("//button[@onclick = 'jsConfirm()']");
    private By jsPromptButton = By.xpath("//button[@onclick = 'jsPrompt()']");
    private By results = By.id("result");

    public JavascriptAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert() {
        driver.findElement(jsAlertButton).click();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    public void triggerConfirm() {
        driver.findElement(jsConfirmButton).click();
    }

    public void triggerPrompt() {
        driver.findElement(jsPromptButton).click();
    }

    public void enterText(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }

    public String getResult() {
        return driver.findElement(results).getText();
    }

    public boolean isAlertButtonDisplayed() {
        return driver.findElement(jsAlertButton).isDisplayed();
    }

    public boolean isConfirmButtonDisplayed() {
        return driver.findElement(jsConfirmButton).isDisplayed();
    }

    public boolean isPromptButtonDisplayed() {
        return driver.findElement(jsPromptButton).isDisplayed();
    }
}
