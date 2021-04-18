package src;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import src.page.GooglePage;
import src.webdriverfactor.WebDriverFactory;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        WebDriver webDriver = new WebDriverFactory().getWebDriver(DriverManagerType.CHROME);
        webDriver.get("https://www.google.com/");
        GooglePage googlePage = new GooglePage(webDriver);
        googlePage.pesquisar("Counter Strike");
        File scrFile = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./image.png"));
        webDriver.quit();
    }
}
