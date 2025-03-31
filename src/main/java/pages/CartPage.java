package pages;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div") 
    private WebElement cartProductName;

    @FindBy(xpath = "//*[@id=\"react-burger-menu-btn\"]") 
    private WebElement menuButton;

    @FindBy(xpath = "//*[@id=\"logout_sidebar_link\"]") 
    private WebElement logoutLink;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean verifyProductInCart(String expectedProduct) {
        return cartProductName.getText().equals(expectedProduct);
    }

    public void logout() {
        clickElement(menuButton); // Click the menu button to expand it
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(logoutLink));

        logoutButton.click(); // Click the logout button to logout 
    }

}
