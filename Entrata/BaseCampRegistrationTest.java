package Entrata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseCampRegistrationTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up Selenium WebDriver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void testBaseCampRegistration() {
        // Step 1: Open the website
        driver.get("https://www.entrata.com/");

        // Step 2: Click on base camp button
        WebElement baseCampButton = driver.findElement(By.xpath("//button[text()='Base Camp']"));
        baseCampButton.click();

        // Step 3: Click on register now button
        WebElement registerNowButton = driver.findElement(By.xpath("//a[text()='Register Now']"));
        registerNowButton.click();

        // Step 4: Fill in all required fields with valid information
        WebElement firstNameInput = driver.findElement(By.name("firstName"));
        firstNameInput.sendKeys("Asim");

        WebElement lastNameInput = driver.findElement(By.name("lastName"));
        lastNameInput.sendKeys("Khan");

        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("asimkhan9512@gmail.com");

        WebElement companyNameInput = driver.findElement(By.name("company"));
        companyNameInput.sendKeys("HCL Technologies");

        WebElement titleInput = driver.findElement(By.name("title"));
        titleInput.sendKeys("Test Engineer");

        WebElement mobileInput = driver.findElement(By.name("mobile"));
        mobileInput.sendKeys("8668258204");

        // Step 5: Click on the "Next" button
        WebElement nextButton = driver.findElement(By.xpath("//button[text()='Next']"));
        nextButton.click();

        // Assertion for successful registration and redirection to confirmation page
        String confirmationPageTitle = driver.getTitle();
        Assert.assertEquals(confirmationPageTitle, "https://www.entrata.com/"); 
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
