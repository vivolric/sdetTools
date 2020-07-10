package Repl_It._02_HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame4 {

    /*
    Navigate to  https://chercher.tech/practice/frames

    Type anything in the topic

    Click on Inner frame Check Box

    Choose  Avatar from the website
     */


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://chercher.tech/practice/frames");

        driver.navigate().to("https://chercher.tech/practice/frames");
        driver.switchTo().frame("frame1");
        driver.findElement(By.cssSelector("body>input")).sendKeys("Lara");
        driver.switchTo().frame("frame3");
        driver.findElement(By.id("a")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        driver.findElement(By.cssSelector("#animals>:last-child")).click();


    }
}