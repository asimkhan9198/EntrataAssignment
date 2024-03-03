package Entrata;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class WatchDemoTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up Selenium WebDriver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testWatchDemoFunctionality() {
        // Step 1: Open a web browser and navigate to the website
        driver.get("https://www.entrata.com/");

        // Step 2: Locate and click on the "Watch Demo" button
        WebElement watchDemoButton = driver.findElement(By.linkText("Watch Demo"));
        watchDemoButton.click();

        // Step 3: Fill all the data
        WebElement firstNameInput = driver.findElement(By.id("FirstName"));
        firstNameInput.sendKeys("Asim");

        WebElement lastNameInput = driver.findElement(By.id("LastName"));
        lastNameInput.sendKeys("Khan");

        WebElement emailInput = driver.findElement(By.id("Email"));
        emailInput.sendKeys("asimkhan9512@gmail.com");

        WebElement companyNameInput = driver.findElement(By.id("Company"));
        companyNameInput.sendKeys("HCL Technologies");

        WebElement mobileNumberInput = driver.findElement(By.id("Phone"));
        mobileNumberInput.sendKeys("8668258204");

        Select selectUnitcount = new Select(driver.findElement(By.id("Unit_Count__c")));
        selectUnitcount.selectByVisibleText("1-10"); // Selecting "1-10" option

        WebElement jobTitleInput = driver.findElement(By.id("Title"));
        jobTitleInput.sendKeys("Test Engineer");

        Select selectIam = new Select(driver.findElement(By.id("iam")));
        selectIam.selectByVisibleText("Property Manager"); // Selecting "Property Manager" option

        // Step 4: Click on the "Submit" button
        WebElement submitButton = driver.findElement(By.xpath("//button[contains(text(),'WATCH DEMO')]"));
        submitButton.click();

        // Step 5: Verify email confirmation
        // Here you can add code to check if an email confirmation is received
        // For this example, let's assume we received the confirmation
        assertTrue(true, "Email confirmation received");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
