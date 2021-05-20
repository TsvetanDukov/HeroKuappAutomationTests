package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemoveElements {

    private WebDriver driver;
    private By addElement = By.cssSelector("div.example > button");
    private By removeElement = By.xpath("//button[contains(@onclick, 'delete')]");

    public AddRemoveElements(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddElementButton() {
        driver.findElement(addElement).click();
    }

    public void clickAddElementButtonMultipleTimes() {
        for (int i = 0; i < 5; i++) {
            driver.findElement(addElement).click();
        }
    }

    public void clickRemoveElement() {
        driver.findElement(removeElement).click();
    }

    public void clickRemoveElementButtonMultipleTimes() {
        for (int i = 0; i < 5; i++) {
            driver.findElement(removeElement).click();
        }
    }
}
