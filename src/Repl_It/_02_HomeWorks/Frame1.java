package Repl_It._02_HomeWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

    /*
    Navigate to  http://demo.guru99.com/test/guru99home/

    Click on Image under the  iFrame will not show if you have adBlock extension enabled text

    In the second window click on Python in the bottom of the page

    Get the URL ( URL1)

    URL1 should be equal to  https://www.guru99.com/python-tutorials.html
     */


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/guru99home/");



    }
}