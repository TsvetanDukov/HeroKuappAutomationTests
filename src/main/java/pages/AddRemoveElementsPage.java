package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemoveElementsPage {

    private WebDriver driver;
    private By addElement = By.cssSelector("div.example > button");
    private By removeElement = By.xpath("//button[contains(@onclick, 'delete')]");

    public AddRemoveElementsPage(WebDriver driver) {
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

    public boolean isDisplayedAddElement() {
        return driver.findElement(addElement).isDisplayed();
    }

    public boolean isDisplayedRemoveElement() {
        return driver.findElement(removeElement).isDisplayed();
    }
}
