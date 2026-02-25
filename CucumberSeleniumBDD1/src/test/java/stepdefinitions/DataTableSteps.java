package stepdefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
import java.util.Map;

public class DataTableSteps{

    WebDriver driver;

    @Given("I open the browser")
    public void i_open_the_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("I open the SauceDemo website")
    public void i_open_the_sauce_demo_website() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("I enter username and password")
    public void i_enter_username_and_password(DataTable dataTable) {

        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

        String username = data.get(0).get("username");
        String password = data.get(0).get("password");

        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }

    @Then("I close the browser")
    public void i_close_the_browser() {
        driver.quit();
    }
}
