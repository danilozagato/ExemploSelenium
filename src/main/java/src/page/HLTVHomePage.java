package src.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/* *
 * Esse padrão chama-se Page Object Pattern, é uma forma de organizar o codigo e o manter separado
 * */

public class HLTVHomePage {

    private WebDriver driver;

    private final By signin = By.xpath("//div[@class='navsignin']");
    private final By username = By.name("username");
    private final By password = By.name("password");
    private final By login = By.name("login");

    public HLTVHomePage(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void clickSignIn() {
        driver.findElement(signin).click();
    }

    public void login() {
        WebElement loginForm = driver.findElement(By.xpath("//div[@id='overlay']//form"));
        loginForm.findElement(username).sendKeys("danilozagato");
        loginForm.findElement(password).sendKeys("PipocaDoce");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginForm.findElement(login).click();
    }
}
