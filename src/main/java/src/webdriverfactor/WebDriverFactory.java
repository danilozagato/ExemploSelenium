package src.webdriverfactor;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;

public class WebDriverFactory implements IWebDriverFactory{

    @Override
    public WebDriver getWebDriver(DriverManagerType driverManagerType) {
        return switch (driverManagerType) {
            case CHROME -> new ChromeDriverFactory().generateChromeDriver();
            case FIREFOX -> new FirefoxWebDriver().generateFirefoxDriver();
            case IEXPLORER -> new IEDriverFactory().generateIEDriver();
            default -> throw new IllegalStateException("Unexpected value: " + driverManagerType);
        };
    }
}
