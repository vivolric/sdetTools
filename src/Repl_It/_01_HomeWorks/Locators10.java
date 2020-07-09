package Repl_It._01_HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators10 {

    /*
    Navigate to https://www.seleniumeasy.com/test/basic-first-form-demo.html

    Enter the first value in the Enter a box

    Enter the second value int the Enter b box

    click on get total

    Print the total from the website

     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        WebElement sum1 = driver.findElement(By.id("sum1"));
        sum1.sendKeys("5");

        WebElement sum2 = driver.findElement(By.id("sum2"));
        sum2.sendKeys("2");

        WebElement getTotal = driver.findElement(By.cssSelector("button[onclick = 'return total()']"));
        getTotal.click();

//        WebElement getTotal = driver.findElement(By.className("btn"));
//        getTotal.click();

        WebElement displayvalue = driver.findElement(By.id("displayvalue"));
        System.out.println(displayvalue.getText());
    }
}
