package sai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class AmazonFlowTest {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);

        // Step 1: Open Amazon
        driver.get("https://www.amazon.in/");

        Thread.sleep(3000);

        // Step 2: Select Category
        driver.findElement(By.id("searchDropdownBox"))
                .sendKeys("Electronics");

        // Step 3: Search Product
        driver.findElement(By.id("twotabsearchtextbox"))
                .sendKeys("Samsung mobile");

        driver.findElement(By.id("nav-search-submit-button"))
                .click();

        Thread.sleep(3000);

        // Step 4: Click First Product
        driver.findElement(By.xpath("//*[@id=\"a40ee1bc-b5f2-4378-a5a7-3db1be422c30\"]/div/div/span/div/div/div/div[2]/div"))
                .click();

        // Switch to new tab
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {
            driver.switchTo().window(window);
        }

        Thread.sleep(3000);

        // Step 5: Add to Cart
        driver.findElement(By.id("add-to-cart-button")).click();

        Thread.sleep(3000);

        // Step 6: Open Cart
        driver.findElement(By.id("nav-cart")).click();

        Thread.sleep(3000);

        // Step 7: Close Browser
        driver.quit();

        System.out.println("Amazon flow completed without login");
    }
}
