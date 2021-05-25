package draganddrop;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DragAndDropTest extends BaseTest {

    @Test
    public void testDragAndDropSquareA () {
        var dragAndDropPage = homePage.clickDragAndDropLink();
        assertTrue(dragAndDropPage.isDisplayedSquareA(), "SquareA is not displayed!");
        assertTrue(dragAndDropPage.isDisplayedSquareB(), "SquareB is not displayed!");
        dragAndDropPage.dragSquareA();
    }
}
