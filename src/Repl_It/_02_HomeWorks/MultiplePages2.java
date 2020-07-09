package Repl_It._02_HomeWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiplePages2 {

    /*
    Navigate to  https://www.naukri.com/

    Hover over on Services

    Click on Text Resume

    Get the URL (url1)

    Verify result as https://resume.naukri.com/mid-level-experienced-professionals-resume-writing?fftid=101001
     */


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.naukri.com/");



    }
}