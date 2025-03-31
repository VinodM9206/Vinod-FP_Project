package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div") 
    private WebElement firstProductName;

    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div") 
    private WebElement firstProductPrice;

    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]") 
    private WebElement addToCartButton;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a") 
    private WebElement cartIcon;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public String getFirstProductName() {
        return firstProductName.getText();
    }

    public String getFirstProductPrice() {
        return firstProductPrice.getText();
    }

    public void addFirstProductToCart() {
        clickElement(addToCartButton);
    }

    public void openCart() {
        clickElement(cartIcon);
    }
}
