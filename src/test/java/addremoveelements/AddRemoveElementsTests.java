package addremoveelements;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AddRemoveElements;

public class AddRemoveElementsTests extends BaseTests {

    @Test
    public void testAddElementOption() {

        AddRemoveElements addRemoveElements= homePage.clickAddRemoveElementsLink();
        addRemoveElements.clickAddElementButton();
    }

    @Test
    public void testAddElementMultipleTimes() {
        AddRemoveElements addRemoveElements = homePage.clickAddRemoveElementsLink();
        addRemoveElements.clickAddElementButtonMultipleTimes();
    }

    @Test
    public void testRemoveElementOption () {
        AddRemoveElements addRemoveElements = homePage.clickAddRemoveElementsLink();
        addRemoveElements.clickAddElementButton();
        addRemoveElements.clickRemoveElement();
    }

    @Test
    public void testRemoveElementMultipleTimes() {
        AddRemoveElements addRemoveElements = homePage.clickAddRemoveElementsLink();
        addRemoveElements.clickAddElementButtonMultipleTimes();
        addRemoveElements.clickRemoveElementButtonMultipleTimes();
    }
}
