package src.webdriverfactor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public final class FirefoxWebDriver {

    private WebDriver driver;
    private FirefoxOptions firefoxOptions = new FirefoxOptions();

    protected WebDriver generateFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        firefoxOptions.setCapability("profile.default_content_setting_values.cookies", 2);
        firefoxOptions.addArguments("--start-maximized");
        driver = new FirefoxDriver();
        return driver;
    }
}
