package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By slider = By.xpath("//div[@class = 'sliderContainer']/input");
    private By range = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setSliderValue(String value) {
        while(!getSliderValue().equals(value)) {
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

        public String getSliderValue(){
            return driver.findElement(range).getText();
        }

    public boolean isDisplayedSlideBar() {
        return driver.findElement(slider).isDisplayed();
    }

    public boolean isDisplayedRangeValue() {
        return driver.findElement(range).isDisplayed();
    }
        }
