package Repl_It._02_HomeWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown3 {

    /*

    Navigate to  https://www.saucedemo.com/

    Enter the user name  as standard_user

    Enter the password as   secret_sauce

    Click on login button

    Choose price low to high

    Verify item prices are sorted from low to high
     */


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");



    }
}