package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;
import pages.CartPage;
import java.io.FileWriter;
import java.io.IOException;


public class TestAddToCart {
    private WebDriver driver;
    private LoginPage loginPage;
    private ProductsPage productsPage;
    private CartPage cartPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\isaac\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);
    }

    @Test(priority = 1)
    public void testLogin() {
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"), "Login Failed");
        System.out.println("Login successful, navigated to Products page");
    }

    @Test(priority = 2)
    public void testAddToCart() throws IOException {
        String productName = productsPage.getFirstProductName();
        String productPrice = productsPage.getFirstProductPrice();

        try (FileWriter file = new FileWriter("product_details.txt")) {
            file.write("Product: " + productName + ", Price: " + productPrice + "\n");
        }
        
        productsPage.addFirstProductToCart();
        productsPage.openCart();
        
        Assert.assertTrue(cartPage.verifyProductInCart(productName), "Product not found in cart");
        System.out.println("Product successfully verified in cart");
    }

    
    @Test(priority = 3)
    public void testLogout() {
        cartPage.logout();
        Assert.assertTrue(driver.getCurrentUrl().contains("saucedemo.com"), "Logout Failed");
        System.out.println("User successfully logged out");
        System.out.println();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
