package Repl_It._02_HomeWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiplePages1 {

    /*
    Navigate to  https://business.twitter.com/en/solutions-new.html

    Get the title of the page (title1)

    Click on  Developer blog

    Get the title of the page (title 2)

    Title 1 and title 2 should NOT  be equal

    Close the current page

    Get the title of the page

    Print the title of the page (title 3)

    Title 1 and Title 3 should be equal
     */


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://business.twitter.com/en/solutions-new.html");



    }
}