package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    //Private fields for elements
    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By dropdownLink = By.linkText("Dropdown");
    private By checkbox = By.linkText("Checkboxes");
    private By addRemoveElements = By.linkText("Add/Remove Elements");
    private By hovers = By.linkText("Hovers");
    private By contextMenu = By.linkText("Context Menu");

    //Constructor to instantiate driver
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    //Public methods for interactions if we are navigated to new page, we should return new page
    //With driver argument
    public LoginPage clickFormAuthenticationLink(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdownLink() {
        driver.findElement(dropdownLink).click();
        return new DropdownPage(driver);
    }

    public CheckboxesPage clickCheckboxLink() {
        driver.findElement(checkbox).click();
        return new CheckboxesPage(driver);
    }

    public AddRemoveElementsPage clickAddRemoveElementsLink() {
        driver.findElement(addRemoveElements).click();
        return new AddRemoveElementsPage(driver);
    }

    public HoversPage clickHoversLink() {
        driver.findElement(hovers).click();
        return new HoversPage(driver);
    }

    public ContextMenuPage clickContextMenuLink() {
        driver.findElement(contextMenu).click();
        return new ContextMenuPage(driver);
    }
    //Create generic method for all links interaction
    //We will find all elements by linkText
    public void clickLinks(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }
}
