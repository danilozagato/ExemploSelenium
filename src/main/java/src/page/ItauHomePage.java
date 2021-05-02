package src.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

/* *
 * Esse padrão chama-se Page Object Pattern, é uma forma de organizar o codigo e o manter separado
 * */

public class ItauHomePage {

    private WebDriver driver;

    private final By agencia = By.id("agencia");
    private final By conta = By.id("conta");
    private final By btnLoginSubmit = By.id("btnLoginSubmit");

    public ItauHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String agencia, String conta) {
        driver.findElement(this.agencia).sendKeys(agencia);
        driver.findElement(this.conta).sendKeys(conta);
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(btnLoginSubmit)).click();
    }

    /*Como Resolver isso ????*/
    public void inserirSenha(Integer[] senha) {
        WebElement teclas = driver.findElement(By.xpath("//div[@class='teclas clearfix']"));
        List<WebElement> botoes = teclas.findElements(By.xpath("//a[@class='tecla left campoTeclado']"));
    }
}
