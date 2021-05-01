package src;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        chromeOptions.setExperimentalOption("prefs", Map.of("profile.default_content_setting_values.cookies", 2));
        chromeOptions.addArguments("--start-maximized");
        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

        webDriver.get("https://www.itau.com.br/");
        webDriver.findElement(By.id("agencia")).sendKeys("0252");
        webDriver.findElement(By.id("conta")).sendKeys("230859");
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("btnLoginSubmit"))).click();

        WebElement teclas = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='teclas clearfix']")));

        List<WebElement> botoes = teclas.findElements(By.xpath("//a[@class='tecla left campoTeclado']"));

        for (WebElement botao : botoes) {
            if (botao.getText().contains("1")) {
                botao.click();
            }
        }
        try {
            File printscreen = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(printscreen, new File("./teste.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(botoes.size());

        webDriver.quit();

        /*
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("btnLoginSubmit"))).click();
        WebElement teclas = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='teclas clearfix']")));
*/


       /* webDriver.findElement(By.xpath("//div[@class='navsignin']")).click();
        webDriver.findElement(By.name("username")).sendKeys("danilozagato");
        webDriver.findElement(By.name("password")).sendKeys("PipocaDoce");
        webDriver.findElement(By.name("login")).click();


        WebElement form = webDriver.findElement(By.xpath("//div[@id='overlay']//form"));
        form.findElement(By.name("username")).sendKeys("danilozagato");
        System.out.println(form.getText());
*/

       /* HLTVHomePage hltvHomePage = new HLTVHomePage(webDriver);
        hltvHomePage.clickSignIn();
        hltvHomePage.login();

        webDriver.quit();*/
    }
}
