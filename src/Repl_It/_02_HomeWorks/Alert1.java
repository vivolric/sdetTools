package Repl_It._02_HomeWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

    /*
    Navigate to "https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/"

    Click on "Simple Alert" button

    Accept the alert

     */


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");



    }
}

