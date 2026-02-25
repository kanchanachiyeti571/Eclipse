package sai;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class yahooLogintest{

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open Yahoo Login Page
        driver.get("https://login.yahoo.com/");

        // Enter Email
        driver.findElement(By.id("login-username")).sendKeys("kanchanachiyeti123@gmail.com");

        // Click Next
        driver.findElement(By.id("login-signin")).click();

        Thread.sleep(3000); 

        // Enter Password
        driver.findElement(By.id("login-password")).sendKeys("kanchana@571");

        // Click Sign in
        driver.findElement(By.id("login-signin")).click();

        Thread.sleep(5000);

        System.out.println("Login Successful");

        // driver.quit();  
    }
}

