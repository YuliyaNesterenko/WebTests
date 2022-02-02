import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest {
    @Test
    public void testFirst() throws InterruptedException {
        String driverPath = "chromedriver.exe";
        String chromedriver = "webdriver.chrome.driver";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "http://www.99-bottles-of-beer.net/";



        System.setProperty(chromedriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        Thread.sleep(3000);

        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult, expectedResult);


        driver.close();
        driver.quit();
    }
}
