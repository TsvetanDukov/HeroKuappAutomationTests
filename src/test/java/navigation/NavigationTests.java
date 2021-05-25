package navigation;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample2Page;

import static org.testng.Assert.assertTrue;

public class NavigationTests extends BaseTest {

    @Test
    public void testNavigator() {
        homePage.clickDynamicLoadingLink().clickExampleOneLink();
        getWindowManager().goBack();
        getWindowManager().refresh();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchTab() {
        homePage.clickMultipleWindowsLink().clickHere();
        getWindowManager().switchToTab("New Window");
    }

    @Test
    public void testOpenInNewWindow() {
        var buttonPage = homePage.clickDynamicLoadingLink().openExample2InNewWindow();
        getWindowManager().switchToNewTab();
        assertTrue(buttonPage.isDisplayedStartButton(), "Start button is not displayed!");
    }
}
