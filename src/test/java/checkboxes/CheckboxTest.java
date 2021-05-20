package checkboxes;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.Checkboxes;

public class CheckboxTest extends BaseTests {

    @Test
    public void testFirstCheckbox() {

        Checkboxes checkboxPage = homePage.clickCheckboxLink();
        checkboxPage.selectCheckbox1();
    }

    @Test
    public void testSecondCheckbox() {
        Checkboxes checkboxPage = homePage.clickCheckboxLink();
        checkboxPage.selectCheckbox2();
    }

    @Test
    public void testBothCheckboxes() {
        Checkboxes checkboxPage = homePage.clickCheckboxLink();
        checkboxPage.selectCheckbox1();
        checkboxPage.selectCheckbox2();
    }

}
