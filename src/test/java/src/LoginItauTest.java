package src;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import src.page.ItauHomePage;
import src.webdriverfactor.WebDriverFactory;

public class LoginItauTest {

    @Test
    public void testLoginItau() {
        WebDriver driver = new WebDriverFactory().getWebDriver(DriverManagerType.CHROME);
        driver.get("https://www.itau.com.br/");
        ItauHomePage itauHomePage = new ItauHomePage(driver);
        itauHomePage.login("","");
    }
}
