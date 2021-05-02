package src.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OndasPage {

    private WebDriver driver;

    private final By estado = By.id("estado");
    private final By cidade = By.id("cidade");

    public OndasPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selecionaCidade(String estado, String cidade) {
        new Select(driver.findElement(this.estado)).selectByValue(estado);
        new Select(driver.findElement(this.cidade)).selectByValue(cidade);
    }
}
