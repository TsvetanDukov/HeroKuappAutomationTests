package checkboxes;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CheckboxesPage;

import static org.testng.Assert.assertTrue;

public class CheckboxTest extends BaseTest {

    @Test
    public void testFirstCheckbox() {

        CheckboxesPage checkboxPage = homePage.clickCheckboxLink();
        assertTrue(checkboxPage.isDisplayedCheckbox1());
        checkboxPage.selectCheckbox1();
        assertTrue(checkboxPage.isSelectedCheckbox1(), "Checkbox 1 is not selected!");
    }

    @Test
    public void testSecondCheckbox() {
        CheckboxesPage checkboxPage = homePage.clickCheckboxLink();
        assertTrue(checkboxPage.isDisplayedCheckbox2());
        checkboxPage.selectCheckbox2();
        checkboxPage.selectCheckbox2();
        assertTrue(checkboxPage.isSelectedCheckbox2(), "Checkbox 2 is not selected!");
    }

    @Test
    public void testBothCheckboxes() {
        CheckboxesPage checkboxPage = homePage.clickCheckboxLink();
        checkboxPage.selectCheckbox1();
        assertTrue(checkboxPage.isSelectedCheckbox1());
        assertTrue(checkboxPage.isSelectedCheckbox2());
    }

}
