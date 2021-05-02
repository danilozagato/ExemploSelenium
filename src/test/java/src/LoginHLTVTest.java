package src;


import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import src.page.HLTVHomePage;
import src.webdriverfactor.WebDriverFactory;

public class LoginHLTVTest {

    @Test
    public void testLoginHLTV() {
        WebDriver driver = new WebDriverFactory().getWebDriver(DriverManagerType.CHROME);
        driver.get("https://www.hltv.org/");
        HLTVHomePage hltvHomePage = new HLTVHomePage(driver);
        hltvHomePage.clickSignIn();
        hltvHomePage.login();
    }
}
