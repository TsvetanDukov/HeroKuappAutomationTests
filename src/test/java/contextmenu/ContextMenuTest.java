package contextmenu;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

import static org.testng.Assert.assertTrue;

public class ContextMenuTest extends BaseTest {

    @Test
    public void testContextClick() {
        ContextMenuPage contextMenuPage = homePage.clickContextMenuLink();
        assertTrue(contextMenuPage.isDisplayedBoxField());
        contextMenuPage.hoverOverAndContextClick();
    }
}
