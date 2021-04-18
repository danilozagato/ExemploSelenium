package src.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage {

    protected WebDriver webDriver;

    private By pesquisar = By.xpath("//input[@title='Pesquisar']");
    private By botaoPesquisar = By.xpath("//input[@value='Pesquisa Google']");

    public GooglePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void pesquisar(String palavraPesquisar) {
        webDriver.findElement(pesquisar).sendKeys(palavraPesquisar);
        //webDriver.findElement(botaoPesquisar).click();
    }

}
