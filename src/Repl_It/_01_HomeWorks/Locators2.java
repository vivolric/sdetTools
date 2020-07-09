package Repl_It._01_HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

    /*
    Navigate to website  https://testpages.herokuapp.com/styled/index.html

    Under the  ORIGINAL CONTENTS

    click on Alerts
          print the URL

    navigate back
         print the URL

    Click on Basic Ajax
         print the URL
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        driver.findElement(By.id("alerts")).click();

        String URL = driver.getCurrentUrl();
        System.out.println(URL);

        driver.navigate().back();

        String URL2 = driver.getCurrentUrl();
        System.out.println(URL2);

        driver.findElement(By.id("basicajax")).click();
        String URL3 = driver.getCurrentUrl();
        System.out.println(URL3);


    }
}
