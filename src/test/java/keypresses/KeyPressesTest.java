package keypresses;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class KeyPressesTest extends BaseTest {

    @Test
    public void testBackspace() {
        KeyPressesPage keyPage = homePage.clickKeyPressesLink();
        assertTrue(keyPage.isDisplayedInputField(), "Input field is missing!");
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertTrue(keyPage.isDisplayedResult(), "Result is not displayed!");
        keyPage.getResult();
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE");
    }
}
