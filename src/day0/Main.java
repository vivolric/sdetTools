package day0;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get( "https://google.com" );
        driver.get("https://bidareyiz.wordpress.com/");
        driver.get("https://www.amazon.com/ref=nav_logo");
        driver.get("https://www.walmart.com/");

    }
}

