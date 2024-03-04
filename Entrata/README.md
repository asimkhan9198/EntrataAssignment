
Entrata Coding Test:

Automated Testing using Selenium WebDriver, TestNG, and Maven
This repository contains automated test scripts for the Entrata website's functionality using Selenium WebDriver, TestNG, and Maven.

Test Scenarios and Test Cases
1) Base Camp Registration Page
Test Scenario: Base camp registration page
Test Case: Verify successful registration process on Base Camp registration page.
Test Steps:
Open a web browser and navigate to https://www.entrata.com/
Click on the Base Camp button.
Click on "Register Now".
Fill in all the required fields with valid information.
Click on the "Next" button.
Expected Result: The user should be successfully registered and redirected to the confirmation page.
Code: BaseCampRegistrationTest.java

2) Property Manager Log-In
Test Scenario: Property Manager Log-In
Test Case: Verify Successful log-In
Test Steps:
Open a web browser and navigate to https://www.entrata.com/
Enter valid username.
Enter valid password.
Click on the "Login" Button.
Expected Result: User should be logged in and directed to the homepage/dashboard.
Code: PropertyManagerLoginTest.java

3) Resources Functionality
Test Scenario: Resources Functionality
Test Case: Verify Resources functionality
Test Steps:
Open a web browser and navigate to https://www.entrata.com/
Mouse over on Resources button.
Select an option from the dropdown (e.g., Guides).
Expected Result: The user should be redirected to the selected option page.
Code: ResourcesFunctionalityTest.java

4) Schedule Demo Functionality
Test Scenario: Schedule Demo Functionality
Test Case: Verify Schedule demo Functionality
Test Steps:
Open a web browser and navigate to https://www.entrata.com/
Locate and click on the "Schedule Demo" button.
Fill all the data & select whether you are a Resident or property manager.
Click on the "Submit" button.
Expected Result: An email confirmation should be received shortly after submission, confirming the demo request details.
Code: ScheduleDemoTest.java

5) Watch Demo Functionality
Test Scenario: Watch Demo Functionality
Test Case: Verify watch demo functionality
Test Steps:
Open a web browser and navigate to https://www.entrata.com/
Locate and click on the "Watch Demo" button.
Fill all the data & select whether you are a Resident or property manager.
Click on the "Submit" button.
Expected Result: An email confirmation should be received shortly after submission, confirming the demo request details.
Code: WatchDemoTest.java

Running the Tests
Clone this repository.
Ensure you have Maven installed.
Navigate to the project directory and run mvn test in the terminal.
Feel free to customize and enhance the test scripts as per your requirements. If you have any questions or need further assistance, feel free to reach out.

Best Regards,
[Your Name]