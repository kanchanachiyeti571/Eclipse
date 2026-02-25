package Testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DBLoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(dataProvider = "dbData")
    public void loginTest(String username, String password) {
        driver.get("https://practicetestautomation.com/practice-test-login");
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("submit")).click();
        
        // Optional: Add assertion to verify login success
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @DataProvider(name = "dbData")
    public Object[][] getDataFromDatabase() throws Exception {
        return DbUtil.getSingleDatabaseRow();
    }
}
