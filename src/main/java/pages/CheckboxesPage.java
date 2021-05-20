package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxesPage {

    private WebDriver driver;
    private By checkbox1 = By.xpath("//form[@id = 'checkboxes']/input[1]");
    private By checkbox2 = By.xpath("//form[@id = 'checkboxes']/input[2]");

    public CheckboxesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectCheckbox1() {
        driver.findElement(checkbox1).click();
    }

    public void selectCheckbox2() {
        driver.findElement(checkbox2).click();
    }

    public boolean isDisplayedCheckbox1() {
        return driver.findElement(checkbox1).isDisplayed();
    }

    public boolean isDisplayedCheckbox2() {
        return driver.findElement(checkbox2).isDisplayed();
    }

    public boolean isSelectedCheckbox1() {
        return driver.findElement(checkbox1).isSelected();
    }

    public boolean isSelectedCheckbox2() {
        return driver.findElement(checkbox2).isSelected();
    }
}
