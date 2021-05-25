package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private WebDriver driver;
    private By example1 = By.xpath("//div[@id = 'content']/div/a[1]");
    private By example2 = By.xpath("//div[@id = 'content']/div/a[2]");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingExample1Page clickExampleOneLink() {
        driver.findElement(example1).click();
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page clickExampleTwoLink() {
        driver.findElement(example2).click();
        return new DynamicLoadingExample2Page(driver);
    }
}
