package src;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import src.page.HLTVHomePage;

import java.util.Map;

public class Main {

    public static void main(String[] args){
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        chromeOptions.setExperimentalOption("prefs", Map.of("profile.default_content_setting_values.cookies", 2));
        chromeOptions.addArguments("--start-maximized");
        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("https://www.hltv.org/");


        HLTVHomePage hltvHomePage = new HLTVHomePage(webDriver);
        hltvHomePage.clickSignIn();
        hltvHomePage.login();

        webDriver.quit();
    }
}
