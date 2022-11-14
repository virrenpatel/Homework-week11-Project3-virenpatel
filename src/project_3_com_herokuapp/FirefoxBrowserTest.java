package project_3_com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //Launch the URL
        driver.get(baseUrl);
        // Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        // Get Current URL
        System.out.println("Current URL:" + driver.getCurrentUrl());
        // Get Page Source
        System.out.println("Page source:"+ driver.getPageSource());
        // Find the email field elements
        WebElement emailField = driver.findElement(By.id("username"));
        // Type email to email field
        emailField.sendKeys("test123@gmail.com");
        // Find the Password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("Password12345");
        //Close the browser
        //driver.close();
    }
}
