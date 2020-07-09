package Repl_It._01_HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

    /*
    Navigate to Website  https://testpages.herokuapp.com/styled/index.html

    Click on  Find By Playground

    Find the 5th text

    then print it
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        driver.findElement(By.id("findby")).click();

        WebElement p5 = driver.findElement(By.id("p5"));
        System.out.println(p5.getText());

    }
}