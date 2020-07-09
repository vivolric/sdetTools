package Repl_It._01_HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements1 {

    /*
    Navigate to  https://www.snapdeal.com/

    Click on  See All Categories on the left navigator

    Get all the categories

    Print the count of the categories --> result should be 11

    Print each text of the categories
     */


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.snapdeal.com/");



    }
}



