package Repl_It._01_HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators15 {

    /*
    Navigate to https://www.seleniumeasy.com/test/basic-first-form-demo.html

    Click on Input Forms
    Click on Radio buttons

    In the  Radio Button Demo table
    Click on Get checked value
    Print text is displated " Radio button is Not checked "

    Click on Male Radio button
    Click on Get Checked Value
    Print text is displayed " Radio button 'Male' is checked "

    Click on Female Radio button
    Click on Get Checked Value

    Print text is displayed " Radio button 'Female' is checked "
     */


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='at-cv-button at-cv-lightbox-yesno at-cm-no-button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Input Forms")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Radio Buttons Demo")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("p>#buttoncheck")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector("div>.radiobutton")).getText());
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Male'][name='optradio']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("p>#buttoncheck")).click();
        System.out.println(driver.findElement(By.cssSelector("p[class='radiobutton']")).getText());
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Female'][name='optradio']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("p>#buttoncheck")).click();
        System.out.println(driver.findElement(By.cssSelector("p[class='radiobutton']")).getText());

    }
}



