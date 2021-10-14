import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.naming.directory.DirContext;

public class HomePage extends BasePage {
    SearchBox searchbox;
    By cartCountLocator = By.className("basketTotalNum");
    By cartContainerLocator = By.className("myBasket");

    public HomePage(WebDriver driver) {
        super(driver);
        searchbox = new SearchBox(driver);
    }

    public SearchBox searchBox() {
        return this.searchbox;
    }

    public boolean isProductCountUp() {
        return getCartCount() > 0;
    }

    public void goToCart() {
        click(cartContainerLocator);
    }

    private int getCartCount(){
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }
}
