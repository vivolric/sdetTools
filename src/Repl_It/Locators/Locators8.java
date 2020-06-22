package Repl_It.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators8 {
    /*
    Navigate to  https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html

    Click on  Normal success message

    Click on x button in the message
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");

        WebElement normal = driver.findElement(By.id("normal-btn-success"));
        normal.click();

        WebElement normal2 = driver.findElement(By.className("close"));
        normal2.click();

        //driver.findElement(By.cssSelector("button[type='button']")).click();

        //driver.findElement(By.cssSelector("div[style='display: block;']")).click();

    }
}
