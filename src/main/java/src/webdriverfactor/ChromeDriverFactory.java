package src.webdriverfactor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Map;

public class ChromeDriverFactory {

    private WebDriver webDriver;
    private ChromeOptions chromeOptions = new ChromeOptions();

    public WebDriver generateChromeDriver() {
        WebDriverManager.chromedriver().setup();
        chromeOptions.setExperimentalOption("prefs", Map.of("profile.default_content_setting_values.cookies", 2));
        chromeOptions.addArguments("--start-maximized");
        webDriver = new ChromeDriver(chromeOptions);
        return webDriver;
    }
}
