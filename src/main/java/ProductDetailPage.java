import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {

    By addToCartButtonLocator = By.id("add-to-cart-button");
    By buyNowButtonLocator = By.id("buy-now-button");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(buyNowButtonLocator);
    }

    public void addToCart() {
        click(addToCartButtonLocator);
    }
}
