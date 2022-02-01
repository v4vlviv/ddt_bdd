package ddt;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DdtTrash extends BaseTest {
    @Test()
    public void verifyLinks0() {
        String url = "https://earth.google.com/web/";
        String text = "Earth";
        String title = "Google Earth";
        driver.get(url);
        assertTrue(driver.findElement(By.tagName("body")).getText().contains(text));
        assertEquals(driver.getTitle(), title);
    }

    @Test()
    public void verifyLinks1() {
        String url = "https://about.google/intl/en/products/#all-products";
        String text = "Chrome";
        String title = "Browse All of Google's Products & Services - Google";
        driver.get(url);
        assertTrue(driver.findElement(By.tagName("body")).getText().contains(text));
        assertEquals(driver.getTitle(), title);
    }

    @Test()
    public void verifyLinks2() {
        String url = "https://earth.google.com/web/";
        String text = "Earth";
        String title = "Google Earth";
        driver.get(url);
        assertTrue(driver.findElement(By.tagName("body")).getText().contains(text));
        assertEquals(driver.getTitle(), title);
    }
}
