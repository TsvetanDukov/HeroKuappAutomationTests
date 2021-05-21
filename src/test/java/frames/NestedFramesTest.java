package frames;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NestedFramesTest extends BaseTest {

    @Test
    public void testNestedFrames() {
        var framesPage = homePage.clickFramesLink();
        var nestedFramesPage = framesPage.clickNestedFramesLink();
        assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT", "Left frame text incorrect!");
        assertEquals(nestedFramesPage.getBottomFrameText(), "BOTTOM", "Bottom frame text incorrect!");
    }
}
