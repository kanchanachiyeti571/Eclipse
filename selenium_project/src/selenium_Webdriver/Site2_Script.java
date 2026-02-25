package selenium_Webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Site2_Script {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        // Open website
        driver.get("https://www.selenium.dev");

        // Keep browser open for 60 seconds
        Thread.sleep(60000);

        driver.quit();
    }
}
