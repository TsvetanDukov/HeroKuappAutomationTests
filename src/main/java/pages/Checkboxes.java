package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkboxes {

    private WebDriver driver;
    private By checkbox1 = By.xpath("//form[@id = 'checkboxes']/input[1]");
    private By checkbox2 = By.xpath("//form[@id = 'checkboxes']/input[2]");

    public Checkboxes(WebDriver driver) {
        this.driver = driver;
    }

    public void selectCheckbox1() {
        driver.findElement(checkbox1).click();
        driver.findElement(checkbox1).isSelected();
    }

    public void selectCheckbox2() {
        driver.findElement(checkbox2).click();
        boolean isSelected = driver.findElement(checkbox2).isSelected();
    }
}
