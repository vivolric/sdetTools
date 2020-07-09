package Repl_It._02_HomeWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {

    /*
    Navigate to  https://www.dezlearn.com/testingpage/

    In the right frame under the Sign up  write any email

    In the right frame write any name

    click on Subscribe

    Get the thank you

    Print the text
     */


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.dezlearn.com/testingpage/");



    }
}