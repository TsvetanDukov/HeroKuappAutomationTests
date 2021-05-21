package horizontalslider;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

import static org.testng.Assert.*;

public class HorizontalSliderTest extends BaseTest {

    @Test
    public void moveSlider() {
        String value = "4";
        HorizontalSliderPage horizontalSlider = homePage.clickHorizontalSliderLink();
        assertTrue(horizontalSlider.isDisplayedSlideBar(), "Slide bar is not displayed!");
        horizontalSlider.setSliderValue(value);
        assertEquals(horizontalSlider.getSliderValue(), value, "Slider value is incorrect!");
    }
}
