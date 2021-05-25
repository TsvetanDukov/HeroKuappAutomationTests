package wait;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ExampleOneWaitTest extends BaseTest {

    @Test
    public void testWaitUntilHidden() {
        var dynamicLoadingPage = homePage.clickDynamicLoadingLink();
        var exampleOnePage = dynamicLoadingPage.clickExampleOneLink();
        assertTrue(exampleOnePage.isDisplayedStartButton(), "Start button is not displayed!");
        exampleOnePage.clickStart();
        assertEquals(exampleOnePage.getLoadedText(), "Hello World!", "Expected message is not displayed!");

    }
}
