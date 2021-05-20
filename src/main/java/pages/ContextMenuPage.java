package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By box = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void hoverOverAndContextClick() {
        WebElement boxField = driver.findElement(box);
        Actions actions = new Actions(driver);
        actions.moveToElement(boxField).contextClick().perform();
    }

    public boolean isDisplayedBoxField() {
        return driver.findElement(box).isDisplayed();
    }
}
