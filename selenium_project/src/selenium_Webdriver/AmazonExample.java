package selenium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Open Amazon
        driver.get("https://www.amazon.in/");
        Thread.sleep(3000);
        // Search Product
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15");

        driver.findElement(By.id("nav-search-submit-button")) .click();

        Thread.sleep(5000);

        // Click First Product
        driver.findElement(By.xpath("(//span[contains(text(),'Apple iPhone')])[1]")).click();
        Thread.sleep(5000);
        //  Switch to new tab
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        // Add to Cart
        driver.findElement(By.id("add-to-cart-button")) .click();
        Thread.sleep(5000);
        // Go to Cart
        driver.findElement(By.id("nav-cart")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}