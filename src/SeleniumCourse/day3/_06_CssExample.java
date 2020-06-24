package SeleniumCourse.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_CssExample {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

//        Navigating to the website
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        WebElement EnterMessage = driver.findElement(By.id("user-message"));
        EnterMessage.sendKeys("I am here");

        Thread.sleep(5000);

       WebElement noThanksButton = driver.findElement(By.linkText("No, thanks!"));
       noThanksButton.click();

        WebElement ShowMessageButton = driver.findElement(By.cssSelector("button[onclick='showInput();']"));
//        WebElement ShowMessageButton = driver.findElement(By.className("btn btn-default"));
        ShowMessageButton.click();

        WebElement yourMessage = driver.findElement(By.id("display"));
        System.out.println(yourMessage.getText());

    }
}
