package Repl_It._01_HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements3 {

    /*
    Navigate to  https://www.snapdeal.com/

    Search for  phone accessories

    Click search button

    Click on Fuson button on the left side

    Get the text next to Fuson

    Verify the item in the page count is equal to text next to Fuson

     */


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.snapdeal.com/");



    }
}



