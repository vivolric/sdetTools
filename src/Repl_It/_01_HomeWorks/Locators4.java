package Repl_It._01_HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators4 {

    /*
    Navigate to website  https://testpages.herokuapp.com/styled/index.html

    Click on  Search

    Print the URL

    Click on Search button

    Print the URL
     */


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        driver.findElement(By.id("searchtest")).click();

        String URL = driver.getCurrentUrl();
        System.out.println(URL);

        driver.findElement(By.cssSelector("input[type='submit']")).click();

    }
}
