package Repl_It._02_HomeWorks;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

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
        String title1 = driver.getTitle();//We are going to use at the end.
        String mainPageHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//button[text()='Decline']")).click();
        driver.findElement(By.cssSelector("a[title='Developer blog']")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            if(!windowHandle.equals(mainPageHandle)){
                driver.switchTo().window(windowHandle);
                String title2 = driver.getTitle();
                Assert.assertNotEquals(title1,title2);
                driver.close();
            }
        }
        driver.switchTo().window(mainPageHandle);
        String title3 = driver.getTitle();
        System.out.println(title3);
        Assert.assertEquals(title1,title3);
    }
}
