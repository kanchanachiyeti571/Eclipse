package selenium_Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoLogin {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//open website
		driver.get("https://www.saucedemo.com/");
		//login
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(5000);
		// add product
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(5000);
		// click cart icon
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(5000);
		//check 
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("first-name")).sendKeys("chiyeti");
		driver.findElement(By.id("last-name")).sendKeys("kanchana");
		driver.findElement(By.id("postal-code")).sendKeys("500001");
		Thread.sleep(5000);
		//continue
		driver.findElement(By.id("continue")).click();
		Thread.sleep(5000);
		//Finish
		driver.findElement(By.id("Finish")).click();
		System.out.println("Order placed Successfully");
		Thread.sleep(2000);
		driver.quit();
		

	}

}
