package src.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class PrintScreen {

    private WebDriver driver;

    public PrintScreen(WebDriver driver) {
        this.driver = driver;
    }

    public void takeScreenShot(String pathName) {
        try {
            File printscreen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(printscreen, new File(pathName));
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
