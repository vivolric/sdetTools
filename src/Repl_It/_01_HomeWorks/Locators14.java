package Repl_It._01_HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators14 {

    /*
    Navigate to https://www.seleniumeasy.com/test/basic-first-form-demo.html

    Click on List box

    Click Box Strap List Box

    Click on bootstrap-duallist and click on right arrow

    Click on  Dapibus ac facilisis in  and click on right arrow

    Click on Cras husto odio and click on left arrow

    Click on Morbi leo risus and click on left arrow

    Left box list should be

    Morbi leo risus
    Porta ac consectetur ac
    Vestibulum at eros
    Cras justo odio
    Morbi leo risus

    Right box table should be

    Dapibus ac facilisis in
    Porta ac consectetur ac
    Vestibulum at eros
    bootstrap-duallist
    Dapibus ac facilisis in
     */


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");

        WebDriver driver = new ChromeDriver();

            driver.navigate().to("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@class='at-cv-button at-cv-lightbox-yesno at-cm-no-button']")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("List Box")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Bootstrap List Box")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//li[contains(text(),'bootstrap-duallist')]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm move-right']")).click();
            Thread.sleep(2000);

            driver.findElement(By.xpath("//li[contains(text(),'Dapibus ac facilisis in')]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm move-right']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//li[contains(text(),'bootstrap-duallist')]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//div[@class='dual-list list-right col-md-5']//li[@class='list-group-item active']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//li[contains(text(),'Cras justo odio')]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm move-left']")).click();
            Thread.sleep(2000);

            driver.findElement(By.xpath("//div[@class='well']//li[contains(text(),'Morbi leo risus')]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm move-left']")).click();
            Thread.sleep(2000);

    }
}



