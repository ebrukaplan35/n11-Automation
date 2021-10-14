import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting_Email_And_Password extends BaseTest{
    @Test
    public void setEmail(){
        LoginFormPage loginFormPage = new LoginFormPage(driver);
        loginFormPage.setEmail("kaplan.ebru35@gmail.com");
        Assertions.assertEquals("kaplan.ebru35@gmail.com",loginFormPage.getEmail(), "E-mail is not correct!");
    }

    @Test
    public void password() {
        LoginFormPage loginFormPage = new LoginFormPage(driver);
        loginFormPage.setPassword("E102500");
        Assertions.assertEquals("E102500",loginFormPage.getPassword(), "Password is not correct!");

    }
}
