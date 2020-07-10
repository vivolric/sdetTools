package Repl_It._02_HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

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

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("http://demo.guru99.com/test/guru99home/");
        driver.switchTo().frame("a077aa5e");
        driver.findElement(By.cssSelector("body>a")).click();
        String secondWindow = driver.getWindowHandle();
        Set<String> handels = driver.getWindowHandles();
        for (String handel:handels) {
            driver.switchTo().window(handel);
        }
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("div>a[href='/python-tutorials.html']")).click();
        System.out.println(driver.getCurrentUrl());
    }
}