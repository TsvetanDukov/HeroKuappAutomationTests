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
    private By keyPresses = By.linkText("Key Presses");
    private By horizontalSlider = By.linkText("Horizontal Slider");
    private By javascriptAlerts = By.linkText("JavaScript Alerts");
    private By fileUpload = By.linkText("File Upload");
    private By wysiwygEditor = By.linkText("WYSIWYG Editor");
    private By frames = By.linkText("Frames");
    private By dynamicLoading = By.linkText("Dynamic Loading");
    private By largeAndDeepDom = By.linkText("Large & Deep DOM");
    private By infiniteScroll = By.linkText("Infinite Scroll");

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

    public KeyPressesPage clickKeyPressesLink() {
        driver.findElement(keyPresses).click();
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSliderLink() {
        driver.findElement(horizontalSlider).click();
        return new HorizontalSliderPage(driver);
    }

    public JavascriptAlertsPage clickJavascriptAlertsLink() {
        driver.findElement(javascriptAlerts).click();
        return new JavascriptAlertsPage(driver);
    }

    public FileUploadPage clickFileUploadLink() {
        driver.findElement(fileUpload).click();
        return new FileUploadPage(driver);
    }

    public WysiwygEditorPage clickWysiwygEditorLink() {
        driver.findElement(wysiwygEditor).click();
        return new WysiwygEditorPage(driver);
    }

    public FramesPage clickFramesLink() {
        driver.findElement(frames).click();
        return new FramesPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoadingLink() {
        driver.findElement(dynamicLoading).click();
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDomPage clickLargeAndDeepDomLink() {
        driver.findElement(largeAndDeepDom).click();
        return new LargeAndDeepDomPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScrollLink() {
        driver.findElement(infiniteScroll).click();
        return new InfiniteScrollPage(driver);
    }
    //Create a generic method for all links interaction
    //We will find all elements by linkText
    public void clickLinks(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }
}
