package Repl_It._01_HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators9 {

    /*
    Navigate to https://www.seleniumeasy.com/test/basic-first-form-demo.html

    Enter the message

    Click on Show message

    Print the value under the Show message button
    */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html ");

        WebElement message = driver.findElement(By.id("user-message"));
        message.sendKeys("Sunday!!!!");

        WebElement showMessage = driver.findElement(By.className("btn-default"));
        showMessage.click();

        WebElement printMessage = driver.findElement(By.id("display"));
        System.out.println(printMessage.getText());


    }
}