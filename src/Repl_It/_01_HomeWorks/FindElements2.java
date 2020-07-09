package Repl_It._01_HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements2 {

    /*
    Navigate to  https://www.snapdeal.com/

    Click on  See All Categories on the left side

    Get all the options under the COMPUTERS, OFFICE & GAMING

    print the count of the options --> result should be 20

    print the text of all the elements in the result
     */


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.snapdeal.com/ ");



    }
}



