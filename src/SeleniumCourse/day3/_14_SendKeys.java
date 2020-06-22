package SeleniumCourse.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _14_SendKeys {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver(); // this will open the chrome browser
        driver.get("http://www.practiceselenium.com");  // this will open the website and wait until full load

        driver.findElement(By.linkText("Check Out")).click();

        driver.findElement(By.id("email")).sendKeys("info@techno.study");

//        WebElement emailInput = driver.findElement(By.id("email"));   bu objecti kullanmiyoruz, cunku variable kullanmiyoruz. sendKeys yeterli
//        emailInput.sendKeys("info@techno.study");


        driver.findElement(By.id("name")).sendKeys("Fatih");

        driver.findElement(By.id("address")).sendKeys("Getty Ave 600");

        driver.findElement(By.className("btn-primary")).click(); // cannot use space in class name
//        driver.quit();
    }
}
