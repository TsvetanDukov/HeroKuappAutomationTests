package checkboxes;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.Checkboxes;

public class CheckboxTest extends BaseTests {

    @Test
    public void selectFirstCheckbox() {

        Checkboxes checkboxPage = homePage.clickCheckboxLink();
        checkboxPage.selectCheckbox1();
    }

    @Test
    public void selectSecondCheckbox() {
        Checkboxes checkboxPage = homePage.clickCheckboxLink();
        checkboxPage.selectCheckbox2();
    }

    @Test
    public void selectBothCheckboxes() {
        Checkboxes checkboxPage = homePage.clickCheckboxLink();
        checkboxPage.selectCheckbox1();
        checkboxPage.selectCheckbox2();
    }

}
