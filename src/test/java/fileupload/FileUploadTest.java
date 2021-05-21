package fileupload;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest {

    @Test
    public void testUploadFile() {
        var uploadPage = homePage.clickFileUploadLink();
        uploadPage.uploadFile("C:\\Users\\tsvetan.dukov\\Documents\\Work Folder\\TLOU2.jpg");
        assertEquals(uploadPage.getUploadedFileName(), "TLOU2.jpg", "Uploaded file is incorrect!");
    }
}
