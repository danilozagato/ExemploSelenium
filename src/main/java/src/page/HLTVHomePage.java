package src.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HLTVHomePage {

    protected WebDriver webDriver;

    private By signin = By.xpath("//div[@class='navsignin']");
    private By username = By.name("username");
    private By password = By.name("password");
    private By login = By.name("login");

    public HLTVHomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickSignIn() {
        webDriver.findElement(signin).click();
    }

    public void login() {
        WebElement loginForm = webDriver.findElement(By.xpath("//div[@id='overlay']//form"));
        loginForm.findElement(username).sendKeys("danilozagato");
        loginForm.findElement(password).sendKeys("PipocaDoce");
        loginForm.findElement(login).click();
    }
}
