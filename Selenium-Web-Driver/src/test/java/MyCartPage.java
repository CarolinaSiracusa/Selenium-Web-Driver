import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyCartPage extends PageObject{

    @FindBy(xpath = "//div[contains(text(), 'Sauce Labs Backpack')]")
    private WebElement myBackPack;

    public MyCartPage(WebDriver driver) {
        super(driver);
    }

    public String getCartProductName() {
        return this.myBackPack.getText();
    }
}
