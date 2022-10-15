import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class PageObject {

    WebDriver webDriver;

    public PageObject(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    By solutionsButton = By.id("comp-keidh9zf2label");
    By koltiTradeButton = By.id("comp-keidh9zfmoreContainer1");

    public void clickKlotiTradeButton() throws InterruptedException {
        webDriver.findElement(solutionsButton).click();
        Thread.sleep(2000);
        webDriver.findElement(solutionsButton).click();
        Thread.sleep(2000);
        webDriver.findElement(koltiTradeButton).click();
    }
}
