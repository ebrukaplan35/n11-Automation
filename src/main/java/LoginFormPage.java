import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormPage extends BasePage{
    By emailInput = By.id("email");
    By passwordInput = By.id("password");

    public LoginFormPage(WebDriver driver) {
        super(driver);
    }

    public void setEmail(String s) {
        click(emailInput);
        type(emailInput, "kaplan.ebru35@gmail.com");
    }

    public String getEmail() {
        return find(emailInput).getAttribute("value");
    }

    public void setPassword(String e102500) {
        click(passwordInput);
        type(passwordInput, "E102500");
    }

    public String getPassword() {
        return find(passwordInput).getAttribute("value");
    }
}
