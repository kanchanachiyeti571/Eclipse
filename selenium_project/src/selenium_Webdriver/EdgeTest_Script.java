package selenium_Webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver; 
public class EdgeTest_Script {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\kanchana\\Desktop\\Selenium_integration\\edgedriver_win64\\Driver_Notes");
	    WebDriver driver = new EdgeDriver();
        //driver.get("https://www.google.com");r.get(\"https://www.google.com\");
        driver.get("https://www.google.com");
        System.out.println("Title" + driver.getTitle());
        driver.quit();
	}
}

