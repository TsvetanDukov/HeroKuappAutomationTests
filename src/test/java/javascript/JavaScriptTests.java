package javascript;

import base.BaseTest;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTest {

    @Test
    public void testScrollToTable() {
        homePage.clickLargeAndDeepDomLink().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph() {
        var infiniteScrollPage = homePage.clickInfiniteScrollLink();
        infiniteScrollPage.scrollToParagraph(5);
    }
}
