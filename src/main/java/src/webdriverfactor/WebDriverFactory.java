package src.webdriverfactor;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {

    private WebDriver webDriver;

    public WebDriver getWebDriver(DriverManagerType driverManagerType) {
        return switch (driverManagerType) {
            case CHROME -> this.generateChromeDriver();
            case FIREFOX -> this.generateFirefoxDriver();
            case IEXPLORER -> generateIEDriver();
            default -> throw new IllegalStateException("Unexpected value: " + driverManagerType);
        };
    }

    private WebDriver generateChromeDriver() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        return webDriver;
    }

    private WebDriver generateFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        webDriver = new FirefoxDriver();
        return webDriver;
    }

    private WebDriver generateIEDriver() {
        WebDriverManager.iedriver().setup();
        webDriver = new InternetExplorerDriver();
        return webDriver;
    }
}
