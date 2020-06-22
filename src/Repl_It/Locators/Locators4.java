package Repl_It.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators4 {

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
