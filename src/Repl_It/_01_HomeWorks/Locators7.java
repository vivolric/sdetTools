package Repl_It._01_HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators7 {

    /*
    Navigate to https://testpages.herokuapp.com/styled/index.html

    Click on Fake Alerts

    Click on  Show modal dialog

    Click on Ok

    Alert should be closed

    */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement clickAlert = driver.findElement(By.id("fakealerttest"));
        clickAlert.click();

        Thread.sleep(3000);

        WebElement clickAlert2 = driver.findElement(By.id("modaldialog"));
        clickAlert2.click();

        Thread.sleep(3000);

        WebElement clickAlert3 = driver.findElement(By.id("dialog-ok"));
        clickAlert3.click();

        //driver.quit();
    }
}
