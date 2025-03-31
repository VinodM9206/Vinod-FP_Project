# Vinod-FP_Project
Overview

This project contains two automation exercises:

UI Automation using Selenium & TestNG to test the "Add to Cart" functionality on SauceDemo.

API Automation using RestAssured to validate a GET request response from Reqres.


Tools & Technologies

Java, Selenium, TestNG, RestAssured

Eclipse IDE, Maven, ChromeDriver

PROJECT STRUCTURE 
Vinod_Assessment/
│── src/
│   ├── main/
│   │   ├── java/
│   │   ├── pages/  # Page Object Model classes
│   ├── test/
│   │   ├── java/
│   │   │   ├── tests/  # UI Automation Tests
│   │   │   ├── apiTests/  # API Automation Tests
│── pom.xml  # Dependencies

Dependencies (from pom.xml)

Selenium Java (4.10.0)

TestNG (7.7.0)

RestAssured (5.3.0)




Setup Instructions

Clone the repository.

Open the project in Eclipse.

Ensure Maven dependencies are installed (mvn clean install).

Download & set up the ChromeDriver.

Run the test scripts.

How to Execute Tests

1️⃣ UI Automation - "Add to Cart" Test

Run the following test class:

/Vinod_Assessment/src/test/java/tests/TestAddToCart.java

This script:

Logs into SauceDemo

Adds the first product to the cart

Verifies the product in the cart

Logs out

Uses the Page Object Model (POM) for cleaner structure

2️⃣ API Automation - "GET Request" Test

Run the following test class:

/Vinod_Assessment/src/test/java/apiTests/TestApiStatusCode.java

This script:

Sends a GET request to https://reqres.in/api/users/2

Validates that the response status code is 200

I have also uploaded screenshot of console output after executing the programs



Notes

Test credentials for SauceDemo are provided on the login page.

Test results will be logged in the console.

Author

Vinod M.
