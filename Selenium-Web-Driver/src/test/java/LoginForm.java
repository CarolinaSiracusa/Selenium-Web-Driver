import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginForm extends PageObject{

    private final String USERNAME = "standard_user";
    private final String PASSWORD = "secret_sauce";
    private final String WRONG_PASSWORD = "dinosaurio";

    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement login_button;

    @FindBy(xpath = "//h3[contains(text(), 'Epic sadface: Username and password do not match any user in this service')]")
    private WebElement wrong_credentials_error;

    public LoginForm(WebDriver driver) {
        super(driver);
    }

    public void enterUsername() {
        this.username.sendKeys(USERNAME);
    }

    public void enterPassword() {
        this.password.sendKeys(PASSWORD);
    }

    public void pressLoginButton() {
        this.login_button.click();
    }

    public void enterWrongPassword() {
        this.password.sendKeys(WRONG_PASSWORD);
    }

    public String getWrongCredentialsError() {
        return this.wrong_credentials_error.getText();
    }
}
