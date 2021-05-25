package wait;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ExampleTwoWaitTest extends BaseTest {

    @Test
    public void testWaitUntilVisible() {
       var dynamicLoadingPage = homePage.clickDynamicLoadingLink();
       var exampleTwoPage = dynamicLoadingPage.clickExampleTwoLink();
       assertTrue(exampleTwoPage.isDisplayedStartButton(), "Start button is not displayed!");
       exampleTwoPage.clickStartButton();
       assertEquals(exampleTwoPage.getLoadedText(), "Hello World!", "Expected message is not displayed!");
    }
}
