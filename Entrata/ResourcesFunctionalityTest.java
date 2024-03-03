package Entrata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ResourcesFunctionalityTest {
    private WebDriver driver;
    private String baseUrl = "https://www.entrata.com/";

    @BeforeClass
    public void setUp() {
        // Set up Chrome driver path
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        // Initialize ChromeDriver instance
        driver = new ChromeDriver();
        // Maximize the browser window
        driver.manage().window().maximize();
    }

    @Test
    public void testResourcesFunctionality() {
        // Open the website
        driver.get(baseUrl);
        // Mouse over on the Resources button
        WebElement resourcesButton = driver.findElement(By.linkText("Resources"));
        actions.moveToElement(resourcesButton).perform();
        // Verify if the dropdown is displayed
        WebElement dropdown = driver.findElement(By.className("dropdown-menu"));
        Assert.assertTrue(dropdown.isDisplayed(), "Dropdown menu is not displayed");
        // Click on the desired option (e.g., Guides)
        WebElement guidesOption = driver.findElement(By.linkText("Guides"));
        guidesOption.click();
        // Verify redirection to the selected option page
        String expectedUrl = "https://www.entrata.com/guides";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Incorrect redirection");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
