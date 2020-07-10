package Repl_It._01_HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators11 {

    /*
    Navigate to  https://www.seleniumeasy.com/test/basic-checkbox-demo.html

    Click on check all button

    Print the " Uncheck All" text from the Uncheck All button

    */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement checkAll = driver.findElement(By.id("check1"));
        checkAll.click();

        WebElement uncheckAll = driver.findElement(By.cssSelector("input[value='Uncheck All']"));

        String printUncheckAll = uncheckAll.getAttribute("value");
        System.out.println(printUncheckAll);

    }

}
