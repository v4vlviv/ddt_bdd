package ddt;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Ddt extends BaseTest {
    private static final Pattern COMMA = Pattern.compile(",");

    @Test(dataProvider = "links")
    public void verifyLinks(String url, String text, String title) {
        driver.get(url);
        assertTrue(driver.findElement(By.tagName("body")).getText().contains(text));
        assertEquals(driver.getTitle(), title);
    }

    @DataProvider(name = "links")
    public Object[][] getLinks() throws IOException {
        List<String> lines = FileUtils.readLines(new File("links.csv"));
        Object[][] csvData = new Object[lines.size()][3];

        for (int i = 0; i < lines.size(); i++) {
            csvData[i] = COMMA.split(lines.get(i));
        }
        return csvData;
    }
}
