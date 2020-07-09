package Repl_It._02_HomeWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame3 {

    /*
    Navigate to  https://www.dezlearn.com/testingpage/

    In the left frame

    Type any text in the Search input

    Click on Search button

    Verify Nothing Found text or your searched text is displayed

     */


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.dezlearn.com/testingpage/");



    }
}