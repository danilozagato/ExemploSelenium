package src.webdriverfactor.utils;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;

public interface IWebDriverFactory {

    WebDriver getWebDriver(DriverManagerType driverManagerType);

}
