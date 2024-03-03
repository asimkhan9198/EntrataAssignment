package Entrata;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class PropertyManagerLoginTest {

	    private WebDriver driver;

	    @BeforeTest
	    public void setUp() {
	        // Set up WebDriver
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Drivers\\chromedriver.exe");
	        driver = new ChromeDriver();
	        // Maximize browser window
	        driver.manage().window().maximize();
	    }

	    @Test
	    public void testSuccessfulLogin() {
	        // Step 1: Open a web browser and navigate to https://www.entrata.com/
	        driver.get("https://www.entrata.com/");

	        // Step 2: Enter valid username
	        WebElement usernameField = driver.findElement(By.id("entrata-username")); // assuming the username field has id="username"
	        usernameField.sendKeys("asimkhan9512@gmail.com");

	        // Step 3: Enter valid password
	        WebElement passwordField = driver.findElement(By.id("entrata-password")); // assuming the password field has id="password"
	        passwordField.sendKeys("Asimkhan@9198");

	        // Step 4: Click on the "Login" Button
	        WebElement loginButton = driver.findElement(By.linkText("Sign In")); // assuming the login button has id="loginButton"
	        loginButton.click();


	        // Assertion: Verify user is logged in and directed to the homepage/dashboard
	        String expectedUrl = "expected_homepage_or_dashboard_url";
	        String actualUrl = driver.getCurrentUrl();
	        Assert.assertEquals(actualUrl, expectedUrl, "User is not directed to the expected homepage/dashboard");
	    }

	    @AfterTest
	    public void tearDown() {
	        // Close the browser
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}

}
