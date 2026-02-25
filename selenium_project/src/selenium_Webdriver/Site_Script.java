package selenium_Webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class Site_Script {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.selenium.dev");

        Actions actions = new Actions(driver);

        // Scroll Down
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);

        // Scroll Down Again
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);

        // Scroll Up
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(2000);

        driver.quit();
    }
}