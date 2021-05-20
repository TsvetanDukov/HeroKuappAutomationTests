package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption() {
        //Navigate to dropdown page
        DropdownPage dropDownPage = homePage.clickDropdownLink();
        //Store desired select in variable for reuse
        String option = "Option 1";
        //Select from dropdown menu
        dropDownPage.selectFromDropDown(option);
        List<String> selectedOptions = dropDownPage.getSelectedOptions();
        //Verify numbers of selections
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        //Verify selected text
        assertTrue(option.equalsIgnoreCase("Option 1"), "Incorrect select!");


    }
}
