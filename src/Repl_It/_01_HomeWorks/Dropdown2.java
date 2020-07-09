package Repl_It._01_HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown2 {

    /*
    Navigate to  https://chercher.tech/practice/practice-dropdowns-selenium-webdriver

    Choose random item from the dropdown 1

    Choose random item from the dropdown 2

    Run the code multiple types and verify it is choosing the different items
     */


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver ");



    }
}



