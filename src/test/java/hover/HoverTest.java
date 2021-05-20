package hover;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.*;

public class HoverTest extends BaseTest {

    @Test
    public void testHoverUser1 () {
        HoversPage hoversPage = homePage.clickHoversLink();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptureDisplayed(), "Caption not displayed!");
        assertEquals(caption.getTitle(), "name: user1", "Caption title incorrect!");
        assertEquals(caption.getLinkText(), "View profile", "Caption link text incorrect!");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect!");
    }
}
