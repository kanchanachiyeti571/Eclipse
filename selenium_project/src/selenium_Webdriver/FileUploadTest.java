package selenium_Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/upload");

        Thread.sleep(2000);
        
        driver.findElement(By.id("file-upload"))
              .sendKeys("C:\\Users\\kanchana\\Desktop\\Kanchana Chiyeti.pdf");

        Thread.sleep(2000);
        driver.findElement(By.id("file-submit")).click();

        Thread.sleep(3000);

        System.out.println("Resume Uploaded Successfully!");

        driver.quit();
    }
}
		
		


