package Repl_It._01_HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators16 {

    /*
    Navigate to  https://www.seleniumeasy.com/test/basic-first-form-demo.html

    Click on input forms
    Click on Radio buttons demo

    In the  Group Radio Buttons Demo table
    Click on male
    Click on 0 to 5
    print the result
    result should be  Sex : Male   Age group: 0 - 5

    Click on 5 to 15
    print the result
    result should be  Sex : Male   Age group: 5 - 15

    Click on 15 to 50
    print the result
    result should be  Sex : Male   Age group: 15 - 50

    Click on female
    Click on 0 to 5
    print the result
    result should be  Sex : female Age group: 0 - 5

    Click on 5 to 15
    print the result
    result should be  Sex : female Age group: 5 - 15
    Click on 15 to 50
    print the result
    result should be  Sex : female Age group: 15 - 50
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
        driver.findElement(By.cssSelector("input[type='radio'][value='Male'][name='gender']")).click(); // clicking on Male Radio
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='ageGroup'][value='0 - 5']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[onclick='getValues();']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector("p.groupradiobutton")).getText());
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='ageGroup'][value='5 - 15']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[onclick='getValues();']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector("p.groupradiobutton")).getText());
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='ageGroup'][value='15 - 50']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[onclick='getValues();']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector("p.groupradiobutton")).getText());
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='radio'][value='Female'][name='gender']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='ageGroup'][value='0 - 5']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[onclick='getValues();']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector("p.groupradiobutton")).getText());
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='ageGroup'][value='5 - 15']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[onclick='getValues();']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector("p.groupradiobutton")).getText());
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='ageGroup'][value='15 - 50']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[onclick='getValues();']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector("p.groupradiobutton")).getText());

    }
}


