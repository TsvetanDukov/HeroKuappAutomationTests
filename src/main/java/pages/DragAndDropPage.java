package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage {

    private WebDriver driver;
    private By squareA = By.id("column-a");
    private By squareB = By.id("column-b");

    public DragAndDropPage(WebDriver driver) {
        this.driver = driver;
    }

    public void dragSquareA() {
        WebElement square1 = driver.findElement(squareA);
        WebElement square2 = driver.findElement(squareB);
        Actions action = new Actions(driver);
        action.dragAndDrop(square1, square2).perform();
    }

    public boolean isDisplayedSquareA() {
        return driver.findElement(squareA).isDisplayed();
    }

    public boolean isDisplayedSquareB() {
        return driver.findElement(squareB).isDisplayed();
    }
}
