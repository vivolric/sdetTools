package Repl_It._01_HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {


    /*
    Navigate to website  https://testpages.herokuapp.com/styled/index.html

    click on Alerts
    Print the URL

    NOTE : After you finished your code in intellij copy from there and print it here.
     */

    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
    WebDriver driver =new ChromeDriver();
    driver.get("https://testpages.herokuapp.com/styled/index.html");

    driver.findElement(By.id("alerttest")).click();

    String URL = driver.getCurrentUrl();
        System.out.println(URL);




}}
