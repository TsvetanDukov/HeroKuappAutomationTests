package frames;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTest extends BaseTest {

    @Test
    public void testWysiwygEditor() {
        var editorPage = homePage.clickWysiwygEditorLink();
        String text1 = "Hello ";
        String text2 = "world!";
        editorPage.clearTextArea();
        editorPage.setTextArea(text1);
        editorPage.increaseIndent();
        editorPage.setTextArea(text2);
        assertEquals(editorPage.getTextFromEditor(), text1 + text2, "Incorrect text!");
    }
}
