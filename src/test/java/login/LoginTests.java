package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTest {

    @Test
    public void testSuccessfulLogin() {
        //Create variable loginPage, because clickForm...(); navigate us to loginPage
        LoginPage loginPage = homePage.clickFormAuthenticationLink();
        //Actions in loginPage
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        //Create variable for secureArea, because after click login button we will be in secureArea page
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        //Assert if actual and expected result are true
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),
                "Alert text incorrect");
    }
}
