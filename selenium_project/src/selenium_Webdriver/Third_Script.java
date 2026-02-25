package selenium_Webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Third_Script {

    public static void main(String[] args) {

        // If required, set path for geckodriver
        System.setProperty("webdriver.gecko.driver","C:\\Users\\kanchana\\Desktop\\Selenium_integration\\geckodriver-v0.36.0-win-aarch64 (1)\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        try {
            driver.manage().window().maximize();
            driver.get("https://www.google.com");

            // Print Browser Name
            System.out.println("Browser: " + driver.getClass().getSimpleName());

            String title = driver.getTitle();
            System.out.println("Page Title: " + title);

            if (title.contains("Google")) {
                System.out.println("Test Pass");
            } else {
                System.out.println("Test Fail");
            }

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}

