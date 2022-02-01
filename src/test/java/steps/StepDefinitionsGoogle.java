package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class StepDefinitionsGoogle {
    private WebDriver driver;

    @Before
    public void createDriver() {
        System.setProperty("webdriver.chrome.driver",
                Paths.get(".").toAbsolutePath() + "\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("^Go to (.+)$")
    public void openUrl(String url) {
        driver.get(url);
    }

    @When("^Body contains (.+)$")
    public void verifyBody(String text) {
        assertTrue(driver.findElement(By.tagName("body")).getText().contains(text));
    }

    @Then("^Page title should be equal (.+)$")
    public void verifyTitle(String title) {
        assertEquals(driver.getTitle(), title);
        driver.quit();
    }

    @After
    public void closeDriver() {
        driver.quit();
    }
}
