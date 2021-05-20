package addremoveelements;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AddRemoveElementsPage;

import static org.testng.Assert.assertTrue;

public class AddRemoveElementsTests extends BaseTest {

    @Test
    public void testAddElementOption() {

        AddRemoveElementsPage addRemoveElements= homePage.clickAddRemoveElementsLink();
        assertTrue(addRemoveElements.isDisplayedAddElement());
        addRemoveElements.clickAddElementButton();
        assertTrue(addRemoveElements.isDisplayedRemoveElement());
    }

    @Test
    public void testAddElementMultipleTimes() {
        AddRemoveElementsPage addRemoveElements = homePage.clickAddRemoveElementsLink();
        addRemoveElements.clickAddElementButtonMultipleTimes();
    }

    @Test
    public void testRemoveElementOption () {
        AddRemoveElementsPage addRemoveElements = homePage.clickAddRemoveElementsLink();
        assertTrue(addRemoveElements.isDisplayedAddElement());
        addRemoveElements.clickAddElementButton();
        assertTrue(addRemoveElements.isDisplayedRemoveElement());
        addRemoveElements.clickRemoveElement();
    }

    @Test
    public void testRemoveElementMultipleTimes() {
        AddRemoveElementsPage addRemoveElements = homePage.clickAddRemoveElementsLink();
        addRemoveElements.clickAddElementButtonMultipleTimes();
        addRemoveElements.clickRemoveElementButtonMultipleTimes();
    }
}
