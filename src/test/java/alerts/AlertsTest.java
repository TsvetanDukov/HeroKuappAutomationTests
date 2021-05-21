package alerts;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.JavascriptAlertsPage;

import static org.testng.Assert.*;

public class AlertsTest extends BaseTest {

    @Test
    public void testAcceptAlerts() {
        var alertsPage = homePage.clickJavascriptAlertsLink();
        assertTrue(alertsPage.isAlertButtonDisplayed(), "Alert button is not displayed!");
        alertsPage.triggerAlert();
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getResult(), "You successfully clicked an alert", "Result text incorrect!");
    }

    @Test
    public void testGetTextFromAlert() {
        var alertPage = homePage.clickJavascriptAlertsLink();
        assertTrue(alertPage.isConfirmButtonDisplayed(), "Confirm button is not displayed!");
        alertPage.triggerConfirm();
        String alertText = alertPage.getAlertText();
        assertEquals(alertText, "I am a JS Confirm", "Alert text incorrect!");
        alertPage.dismissAlert();
    }

    @Test
    public void testEnterTextInAlert() {
        var alertPage = homePage.clickJavascriptAlertsLink();
        assertTrue(alertPage.isPromptButtonDisplayed());
        alertPage.triggerPrompt();
        String text = "TAU rocks!";
        alertPage.enterText(text);
        alertPage.acceptAlert();
        assertEquals(alertPage.getResult(), "You entered: " + text, "Result is incorrect!");
    }
}
