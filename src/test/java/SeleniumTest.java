import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    WebDriver webDriver;

    @Before
    public void openWebBrowser(){
        System.out.println("Before Test");

        System.setProperty("webdriver.chrome.driver", "D:\\webDriver\\chromedriver.exe");
        webDriver = new ChromeDriver();

        webDriver.get("https://www.koltiva.com/");
        webDriver.manage().window().maximize();

    }

    @Test
    public void testKoltiva() throws InterruptedException {
        PageObject pageObject = new PageObject(webDriver);
        Assert.assertEquals("Koltiva | Beyond Traceability | From Seed to Table", webDriver.getTitle());

        pageObject.clickKlotiTradeButton();
        Thread.sleep(2000);
        Assert.assertEquals("KoltiTrade | Koltiva", webDriver.getTitle());
    }

    @After
    public void closeWebBrowser(){
        webDriver.quit();
    }
}
