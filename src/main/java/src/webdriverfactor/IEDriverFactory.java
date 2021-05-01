package src.webdriverfactor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriverFactory {

    private WebDriver webDriver;

    public WebDriver generateIEDriver() {
        WebDriverManager.iedriver().setup();
        webDriver = new InternetExplorerDriver();
        return webDriver;
    }
}
