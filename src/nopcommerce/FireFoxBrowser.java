package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxBrowser {

    public static void main(String[] args) {

        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.firefox.driver","drivers/geckodriver.exe");

        // Creating the object for FireFox Browser
        WebDriver driver = new FirefoxDriver();

        //Launching the URL
        driver.get(baseUrl);

        // Maximise the browser window
        driver.manage().window().maximize();

        // Giving implicit wait time to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Getting the page title
        String title = driver.getTitle();
        System.out.println("The page title is: " +title);

        // Getting current URL
        System.out.println("Current URL is: " +driver.getCurrentUrl());

        // Getting page source
        System.out.println("Page source is: " +driver.getPageSource());

        // Find the Username field and enter the username
        WebElement emailField = driver.findElement(By.name("Email"));
        emailField.sendKeys("user123@xyz.com");

        //Find the password field element and enter the password
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("user123");

        // Closing the browser
        driver.quit();
    }
}
