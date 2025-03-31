package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"user-name\"]") 
    private WebElement usernameField;

    @FindBy(xpath = "//*[@id=\"password\"]") 
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"login-button\"]") 
    private WebElement loginButton;

    public LoginPage(WebDriver driver) 
    {
        super(driver);
    }

    public void login(String username, String password) 
    {
        enterText(usernameField, username);
        enterText(passwordField, password);
        clickElement(loginButton);
    }
}
